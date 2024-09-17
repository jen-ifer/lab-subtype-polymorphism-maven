package edu.grinnell.csc207.blocks;

/**
 * A text block surrounded by a single letter.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class Surrounded implements AsciiBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The stuff in the box.
   */
  AsciiBlock contents;

  /**
   * The character we put around the box.
   */
  String boxChar;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block with the specified contents.
   *
   * @param blockContents
   *   The contents of the block.
   *
   * @param surroundChar
   *   The character that we use to surround the block.
   */
  public Surrounded(AsciiBlock blockContents, char surroundChar) {
    this.contents = blockContents;
    this.boxChar = Character.toString(surroundChar);
  } // Boxed(AsciiBlock)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @param i the number of the row
   *
   * @return row i.
   *
   * @exception Exception
   *   If the row is invalid.
   */
  /*public String row(int i) throws Exception {
    int a = this.contents.height();
    if(a==0){
      //the top of the box
      return boxChar.repeat(this.contents.width());
    }else if(i== a+i){
      // the bottom of the box
      return boxChar.repeat(this.contents.width());
    }
    else if ((i>0)&&(1<=a)){
      //stuff in between
      return boxChar + this.contents.row(i-1)+boxChar;
    }else{
      throw new Exception("Invalid row " + i);
    } // if/else
  } // row(int)*/
  public String row(int i) throws Exception {
    if ((i == 0) || i == height() -1) {
      // Top r botten Rows
        return boxChar.repeat(width());
    } else if (i> 0 && i < height() -1){
       // Middle Rows
       return boxChar + " " + this.contents.row(i-0) + " " + boxChar;
      } else {
        throw new Exception("invalid row" + 1);
      }
     
    
  }



  /**
   * Determine how many rows are in the block.
   *
   * @return the number of rows
   */
  public int height() {
    return 0;   // STUB
  } // height()

  /**
   * Determine how many columns are in the block.
   *
   * @return the numbrer of columns
   */
  public int width() {
    return 0;   // STUB
  } // width()
} // class Surrounded
