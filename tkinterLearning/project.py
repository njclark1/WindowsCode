# programmers: Noah, Alec, Nick
# date: 2021 03 21
# modi date: 2021 03 25
# purpose: This program is a graphical interface for interacting with a database
#next: build main screen, pull info from DB to display,

#import statements
import tkinter as tk
from tkinter import ttk,messagebox, Frame, Button, Radiobutton, StringVar,Label, Entry, Tk, IntVar, simpledialog, Canvas
import hashlib
from tkinter.ttk import *
import tkinter.ttk as ttk
from pandas import read_sql,DataFrame
import pandas as pandas
from pandas.core import frame
import pyodbc

#cred enter
#validate cred
#return info
#format info


#main function
def main():
    window = Tk()
    #window.state('zoomed') #fullscreen
    work(window)
    window.geometry("600x400") #change window size here
    window.protocol("WM_DELETE_WINDOW", lambda: quit_me(window))
    window.title("PassBase")
    window.mainloop()

#quit_me for closing windows
def quit_me(window):
    print('quit')
    window.quit()
    window.destroy()

#work function 
def work(window):
    
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
    passEntry = Entry(topframe)
    passEntry.pack(side = "top")
    
    #botframe container
    b1 = Button(botframe,text="Login",command=lambda:SQL(userEntry.get(),passEntry.get())).pack(side="top")
    b2 = Button(botframe,text="Exit",command=lambda:quit_me(window)).pack(side="top")
    b3 = Button(botframe, text = "New User", command = lambda:newUser(Mainframe,window)).pack(side = "top")

    #creating new user
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
    #backButton = Button(newBotFrame, text = "Back", command = lambda:work(window)).pack(side = "top")



    #verify password hashing
def hashingCompare(realshow,password):
    realshow = str(realshow)
    result = hashlib.sha256(password.encode())
    result2 = hashlib.sha256(realshow.encode())
    print(result,result2)
    if result == result2:
        #yes authenticate
        pass
    else:
        #no auth
        pass

    #create new user credentials
def newUserSQL(master_username,master_password,first_name,last_name,email):
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

    #connect user to database
def SQL(username,password):
    sterile_execute ="Select master_password from [user] WHERE master_username = '" + username + "';"#code to send to database 
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
    hashingCompare(password,realshow)

#call main function
main()