import tkinter
from tkinter.constants import ACTIVE, END, NORMAL

#myClick function
def myClick():
    myLabel4 = tkinter.Label(text= "Hello, " + myEntry.get())
    myLabel4.grid(row=2, column=0) 

root = tkinter.Tk()

#Create label widget
myLabel1 = tkinter.Label(root, text = "Enter your name below")


#Display widget on screen
myLabel1.grid(row=0, column=0)

#button1
myButton1 =tkinter.Button(root, text="Click Here", command=myClick, fg="black", bg="purple", padx=5, pady=5, state=NORMAL)
myButton1.grid(row=1, column=1)

#entry box 1
myEntry = tkinter.Entry(root, width= 100, bg="pink", borderwidth=5)
myEntry.grid(row=1, column=0)
myEntry.get()


#main loop
root.mainloop()



