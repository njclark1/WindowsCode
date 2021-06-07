# programmers: Noah, Alec, Nick
# date: 2021 03 21
# modi date: 2021 04 28
# purpose: This program is a graphical interface for interacting with a database
#next must do:  filters,edit cred,
#next like to do:,icons

#PROBLEM
#all of the security questions and passwords have a cred_id attached, all users are assigned the same cred_id's, repeating.
#the database has no way of knowing which user the cred_id's are attached to. this is apparent when selecting all from security_question and there are multiple questions for a single cred_id

#import statements
import hashlib#hashing
import tkinter as tk#display
from tkinter import ttk,messagebox, Frame, Button, Radiobutton, StringVar,Label, Entry, Tk, IntVar, simpledialog, Canvas
from tkinter.ttk import *
import tkinter.ttk as ttk
from pandas import read_sql,DataFrame#read sql
import pandas as pandas
import pyodbc#database
from urllib.request import urlopen#icon

#cred enter
#validate cred
#return info
#format info

#main function
def main():
    window = Tk()
    #window.state('zoomed') #fullscreen
    startingScreen(window)
    window.geometry("600x400") #change window size here
    window.protocol("WM_DELETE_WINDOW", lambda: quit_me(window))
    window.title("PassBase")
    window.mainloop()
#quit_me for closing windows
def quit_me(window):
    print('quit')
    window.quit()
    window.destroy()
#intial
def startingScreen(window):
    
    #mainframe
    Mainframe= Frame(window)
    Mainframe.pack(fill="both",expand="True")
    
    #topframeplaceholder
    topframeplaceholder = tk.Frame(Mainframe)
    topframeplaceholder.pack(side="top",fill="both",expand="True")
    #topframe
    topframe = tk.Frame(Mainframe)
    topframe.pack(side="top",fill="both",expand="True")
    #botframe
    botframe = tk.Frame(Mainframe)
    botframe.pack(side="top",fill="both",expand="True")
    #botframeplaceholder
    botframeplaceholder = tk.Frame(Mainframe)
    botframeplaceholder.pack(side="top",fill="both",expand="True")

    # username label
    userLabel = Label(topframe,text="Username").pack(side= "top")
    # username text box
    userEntry= Entry(topframe)
    userEntry.pack(side="top")
    # password label
    passLabel = Label(topframe, text = "Password").pack(side = "top")
    # password text box
    passEntry = Entry(topframe,show="*")
    passEntry.pack(side = "top")
    
    #botframe container
    #b1 = Button(botframe,text="Login",command=lambda:formatMainScreen(Mainframe,window)).pack(side="top")
    b1 = Button(botframe,text="Login",command=lambda:SQL(Mainframe,window,"naburke","Sadoldblowjobs1`")).pack(side="top")
    
    #b1 = Button(botframe,text="Login",command=lambda:SQL(Mainframe,window,userEntry.get(),passEntry.get())).pack(side="top")
    b2 = Button(botframe,text="Exit",command=lambda:quit_me(window)).pack(side="top")
    b3 = Button(botframe, text = "New User", command = lambda:newUser(Mainframe,window)).pack(side = "top")

    #creating new user
#new user
def newUser(Mainframe,window):
    # wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    # for win in wind:
    #     win.pack_forget()
    window.title("PassBase New User Creation")
    Mainframe.pack_forget()
    newUserFrame = Frame(window)
    newUserFrame.pack(fill = "both", expand = "True")

    #top placeholder
    newTopPlaceHolder = tk.Frame(newUserFrame)
    newTopPlaceHolder.pack(side = "top", fill = "both", expand = "True")
    #top frame
    newTopFrame = tk.Frame(newUserFrame)
    newTopFrame.pack(side = "top", fill = "both", expand = "True")
    # bottom frame
    newBotFrame = tk.Frame(newUserFrame)
    newBotFrame.pack(side = "top", fill = "both", expand = "True")

    # new user login labels and text boxes
    #firstname label
    firstNameLabel = Label(newTopFrame, text = "First name").pack(side = "top")
    firstNameEntry = Entry(newTopFrame)
    firstNameEntry.pack(side = "top")
    #lastname label
    lastNameLabel = Label(newTopFrame, text = "Last name").pack(side = "top")
    lastNameEntry = Entry(newTopFrame)
    lastNameEntry.pack(side = "top")
    #email label
    emailLabel = Label(newTopFrame, text = "Email address").pack(side = "top")
    emailEntry = Entry(newTopFrame)
    emailEntry.pack(side = "top")
    #new username label
    newUsernameLabel = Label(newTopFrame, text = "Username").pack(side = "top")
    newUsername = Entry(newTopFrame)
    newUsername.pack(side = "top")
    #new password label
    newPasswordLabel = Label(newTopFrame, text = "Password").pack(side = "top")
    newPassword = Entry(newTopFrame)
    newPassword.pack(side = "top")

    # new user creation buttons
    #newSubmitButton
    submitbutton = Button(newBotFrame, text = "Submit", command = lambda:newUserSQL(newUsername.get(),newPassword.get(),firstNameEntry.get(),lastNameEntry.get(),emailEntry.get())).pack(side = "top")
    #backButton = Button(newBotFrame, text = "Back", command = lambda:startingScreen(window)).pack(side = "top")
    
    #verify password hashing
def newUserSQL(master_username,master_password,first_name,last_name,email):#create new user credentials
    master_password = hashlib.sha256(master_password.encode())
    master_password = master_password.hexdigest()
    sterile_execute ="INSERT INTO [user] (master_username, master_password, first_name, last_name, email) VALUES ('"+ master_username + "' , '" + master_password + "' , '" + first_name + "' , '" + last_name+ "' , '" + email+ "')"#code to send to database
    server = 'hopper.ws.edu' 
    database = 'naburke' 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID=''naburke'';PWD=''Sadoldblowjobs1`')
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    realshow = pandas.read_sql(sterile_execute,conn)
    if realshow != "":
        print("New user created!")
#old user
def SQL(Mainframe,window,username1,password1):
    global server
    server = 'hopper.ws.edu' 
    global database
    database = 'naburke'
    global password
    password = password1
    global username
    username = username1

    sterile_execute ="Select master_password from [user] WHERE master_username = '" + username + "';"#code to send to database 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    realshow = pandas.read_sql(sterile_execute,conn)
    hashingCompare(Mainframe,window,password,realshow)#login info
def hashingCompare(Mainframe,window,password,realshow):
    givenPass = str(password)
    DBPass = str(realshow)
    DBPass = givenPass.strip()
    DBPass = givenPass.replace("master_password","")
    DBPass = givenPass.replace("\\n","")
    DBPass = givenPass.replace("0","")
    DBPass = givenPass.strip()

    result = hashlib.sha256(givenPass.encode())
    result2 = hashlib.sha256(DBPass.encode())
    print(result.hexdigest(),result2.hexdigest()  )
    if result.hexdigest() == result2.hexdigest():
        #yes authenticate, send to main screen
        formatMainScreen(Mainframe,window)
        print("yep")
    else:
        #no auth, send back to starting screen
        print("nope")

#create credential screen
def formatMainScreen(Mainframe,window):
    def on_configure(event):
        """Set the scroll region to encompass the scrolled frame"""
        canvas.configure(scrollregion=canvas.bbox("all"))
    #FRAME BUILDING
    wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    for win in wind:
        win.pack_forget()
    
    #rightframe
    rightframe = tk.Frame(Mainframe)#filters
    rightframe.pack(side="right",fill="y")
    #leftframe
    midframe = tk.Frame(Mainframe)#credential info
    midframe.pack(side="left",fill="both",expand="True")

    vsb = tk.Scrollbar(midframe, orient="vertical")
    vsb.pack(side="right", fill="y")

    # The Canvas which supports the Scrollbar Interface, layout to the left
    canvas = tk.Canvas(midframe, borderwidth=0, background="#ffffff")
    canvas.pack(side="left", fill="both", expand=True)

    # Bind the Scrollbar to the canvas Scrollbar Interface
    canvas.configure(yscrollcommand=vsb.set)
    vsb.configure(command=canvas.yview)

    # The Frame to be scrolled, layout into the canvas
    # All widgets to be scrolled have to use this Frame as parent
    scrolled_frame = tk.Frame(canvas, background=canvas.cget('bg'))
    canvas.create_window((4, 4), window=scrolled_frame, anchor="nw")

    # Configures the scrollregion of the Canvas dynamically
    scrolled_frame.bind("<Configure>", on_configure)

    #FILTER CREATION
    #web filter
    
    webFilter = "SELECT * FROM [credential] WHERE category_name = 'Web';"
    webBttn = Button(rightframe,text="Web", command =lambda:filterSQL(webFilter))
    webBttn.pack(side='top')
    #software filter
    
    softFilter = "SELECT * FROM [credential] WHERE category_name = 'Software';"
    softBttn = Button(rightframe,text='Software', command =lambda:filterSQL(softFilter))
    softBttn.pack(side='top')
    #hardware filter
    
    hardFilter = "SELECT * FROM [credential] WHERE category_name = 'Hardware';"
    hardBttn = Button(rightframe,text='Hardware', command =lambda:filterSQL(hardFilter))
    hardBttn.pack(side='top')
    
    #add button
    add = Button(rightframe,text="ADD NEW CREDENTIAL",command=lambda: addEditCredential(Mainframe,window))#,command=lambda: addEditCredential()
    add.pack(side='bottom')

    #INFO INSERTION
    #for statement, credential card creation
    amountOfFramesNeeded = int(numOfCredsSQL())
    credentialInfo = credentialSQL()#[0]title  [1]username [2]password [3]website_url  [4]description [5]category
    frames = []
    for counter in range(amountOfFramesNeeded):# create frames depending on info retruned from DB
        currentInfo = credentialInfo[counter]
        if currentInfo[5] == "Hardware" and currentInfo[5] == "Software": #if hard/soft then dont show, web only one visble
            break
        #parent 
        created = Frame(scrolled_frame,borderwidth=1, relief='solid')
        created.pack(side="top",fill="x",pady=2)
        #children
        buttonframe = Frame(created)
        buttonframe.pack(side="right",fill="y",expand="True")
        infoframe = Frame(created)
        infoframe.pack(side="left",fill="both",expand="True")
        userpassframe = Frame(created)
        userpassframe.pack(side="right",fill="both",expand="True")
        #labels
        title = Label(infoframe,text=currentInfo[0])#title
        L1= Label(userpassframe,text=currentInfo[1])#username
        L2= Label(userpassframe,text=currentInfo[2])#password
        #buttons
        B1= Button(buttonframe,text="Security Questions",command=securityQuestions())
        B2 = Button(buttonframe,text="Old Passwords",command=oldPassword())
        #pack
        title.pack(side="left")
        L1.pack(side="top")
        L2.pack(side="top")
        B1.pack(side='top')
        B2.pack(side='top')
        # Add the Frame to the list
        frames.append(created)#fill with credentials

def securityQuestions(Mainframe):
    wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    for win in wind:
        win.pack_forget()
    left = Frame(Mainframe)
    right = Frame(Mainframe)
    left.pack(side="left")
    right.pack(side="right")
def oldPassword(Mainframe):
    wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    for win in wind:
        win.pack_forget()
    
    left = Frame(Mainframe)
    right = Frame(Mainframe)
    left.pack(side="left",expand="True")
    right.pack(side="right")
    tv1

def credentialSQL():#[0]title[1]username[2]password[3]website_url[4]description [5]category_name
    sterile_execute ="Select title,username,[password],website_url,description,category_name from [credential] WHERE master_username = '" + username + "';"#code to send to database 
    server = 'hopper.ws.edu'  
    database = 'naburke' 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    realshow = pandas.read_sql(sterile_execute,conn)
    info = realshow
    info = info.to_numpy().tolist()
    return info
def numOfCredsSQL():

    sterile_execute ="SELECT COUNT(credential_id) from [credential] WHERE master_username = '" + username +"' "#code to send to database 
    server = 'hopper.ws.edu'  
    database = 'naburke' 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    realshow = pandas.read_sql(sterile_execute,conn)
    info = realshow
    info = info.to_numpy().tolist()
    df_rows = str(info)
    df_rows = df_rows.replace("[","")
    df_rows = df_rows.replace("]","")
    df_rows = df_rows.replace(",","|")
    df_rows = df_rows.replace("'","")
    df_rows = df_rows.rstrip(" ")
    df_rows = df_rows.split("|")
    df_rows = df_rows[0]
    return df_rows
def securityQuestionsSQL():
    pass
def oldPasswordSQL():
    pass
def filterSQL(statement):
    sterile_execute =  statement#code to send to database 
    server = 'hopper.ws.edu'  
    database = 'naburke' 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    realshow = pandas.read_sql(sterile_execute,conn)
    info = realshow
    info = info.to_numpy().tolist()
    
    #function to add new credential to database
def AddSQL(Mainframe, window, newCredTitleEntry, newCredUsernameEntry, newCredPasswordEntry, newCredURLEntry,newCredDescriptionEntry,newCredCategoryNameEntry):
    sterile_execute = "INSERT INTO [credential]( title, username, password, website_url, description, category_name,master_username) VALUES ('"+newCredTitleEntry+"', '"+newCredUsernameEntry+"', '"+newCredPasswordEntry+"', '"+newCredURLEntry+"', '"+newCredDescriptionEntry+"', '"+newCredCategoryNameEntry+"','"+username+"');"
    #code to send to database 
    server = 'hopper.ws.edu'  
    database = 'naburke' 
    conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)
    cursor = conn.cursor()
    #executing string with cursor
    print(sterile_execute)
    cursor = conn.cursor()
    cursor.execute(sterile_execute)
    conn.commit()#need to commit
    wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    for win in wind:
        win.grid_forget()
    formatMainScreen(Mainframe, window)

def addEditCredential(Mainframe, window):#add cred
    #newCredentialFrame = Frame(window)
    #newCredentialFrame.pack(fill = "both", expand = "True")
    wind = Mainframe.winfo_children()#get current widget names then destroy to clear window
    for win in wind:
        win.pack_forget()
    bgname = r"H:\NewAirport\Gui_pictures\relaxwing.png"
    bg_image = tk.PhotoImage(file=bgname)
    w = bg_image.width()
    h = bg_image.height()
    cvl = tk.Canvas(Mainframe,width=w, height=h)
    cvl.photo=bg_image
    cvl.place(x=0,y=0)
    cvl.create_image(0, 0, image=bg_image, anchor='nw')

    #credential Title entry
    newCredTitleLabel = tk.Label(Mainframe, text="Title",pady=15)
    newCredTitleLabel.grid(row=2, column= 1)
    newCredTitleEntry = tk.Entry(Mainframe)
    newCredTitleEntry.grid(row=2,column=2)
    #credential Username entry
    newCredUsernameLabel = tk.Label(Mainframe, text="Username",pady=15)
    newCredUsernameLabel.grid(row=3, column= 1)
    newCredUsernameEntry = tk.Entry(Mainframe)
    newCredUsernameEntry.grid(row=3,column=2)
    #credential password entry
    newCredPasswordLabel = tk.Label(Mainframe, text="Password",pady=15)
    newCredPasswordLabel.grid(row=4, column= 1)
    newCredPasswordEntry = tk.Entry(Mainframe)
    newCredPasswordEntry.grid(row=4,column=2)
    #credential URL entry
    newCredURLLabel = tk.Label(Mainframe, text="URL",pady=15)
    newCredURLLabel.grid(row=5, column= 1)
    newCredURLEntry = tk.Entry(Mainframe)
    newCredURLEntry.grid(row=5,column=2)
    #credential description entry
    newCredDescriptionLabel = tk.Label(Mainframe, text="Description",pady=15)
    newCredDescriptionLabel.grid(row=6, column= 1)
    newCredDescriptionEntry = tk.Entry(Mainframe)
    newCredDescriptionEntry.grid(row=6,column=2)
    #credential category name entry
    newCredCategoryNameLabel = tk.Label(Mainframe, text="Category Name",pady=15)
    newCredCategoryNameLabel.grid(row=7, column= 1)
    newCredCategoryNameEntry = tk.Entry(Mainframe)
    newCredCategoryNameEntry.grid(row=7,column=2)

    #submit new credential
    submitbutton = tk.Button(Mainframe,text= "SUBMIT",command= lambda: AddSQL(Mainframe, window, newCredTitleEntry.get(), newCredUsernameEntry.get(),
            newCredPasswordEntry.get(), newCredURLEntry.get(),newCredDescriptionEntry.get(),newCredCategoryNameEntry.get()))
    submitbutton.grid(row=6,columnspan=2,column= 7)

    #back and close
    backbutton = tk.Button(Mainframe,text="back",command=lambda: formatMainScreen(Mainframe,window))
    backbutton.grid(row=4,column=4)
    closebutton = tk.Button(Mainframe,text="Exit",command=lambda: quit_me(window))
    closebutton.grid(row=4, column=3)

#call main function
main()