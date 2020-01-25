package behaviour.command;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }   // перед кожною операцію створюється новий бекап а потім обєкт Command запихається у Stack у CommandHistory
        // по цьому бекапу і буде відновлюватись попередній стан тексту після undo

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
