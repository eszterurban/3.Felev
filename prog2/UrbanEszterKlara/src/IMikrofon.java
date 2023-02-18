public interface IMikrofon {
    String felveteltKeszit() throws FelveteltKeszitException;

    Hangformatum getFormatum();
}
