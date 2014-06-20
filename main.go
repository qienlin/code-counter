package main

import(
	"fmt"
	
	"github.com/andlabs/ui"
)
func main(){
	err := ui.Go(mainWindow)
	if err != nil{
		panic(fmt.Errorf("error initializing UI library: %v", err))
	}
}

func mainWindow(){
	var window *ui.Window
	status := ui.NewLabel("")
	
	window = ui.NewWindow("Code counter", 400, 200)
	ui.AppQuit = window.Closing
	
	bConfirm := ui.NewButton("Confirm")
	bCancel := ui.NewButton("Cancel")
	buttonBox := ui.NewHorizontalStack(bConfirm, bCancel)
	buttonBox.SetStretchy(0)
	buttonBox.SetStretchy(1)
	buttonBox = ui.NewHorizontalStack(buttonBox, status)
	
	listBox := ui.NewListbox("a", "b", "c", "d", "e")
	
	
	grid := ui.NewGrid(2, 
		ui.NewLabel("User Name"), ui.NewLineEdit(""),
		ui.NewLabel("Password"), ui.NewLineEdit(""),
		ui.Space(), ui.Space(), 
		ui.Space(), listBox)
	window.Open(grid)
	
	for{
		select {
			case <- window.Closing:
				break
			case <- bConfirm.Clicked:
				status.SetText("Confirm clicked...")
		}
	}
}
