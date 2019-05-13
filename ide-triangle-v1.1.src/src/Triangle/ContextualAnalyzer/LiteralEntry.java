/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.ContextualAnalyzer;

import Triangle.AbstractSyntaxTrees.Declaration;

/**
 *
 * @author vicnb
 */
public class LiteralEntry {
    
  protected String id;
  
  protected int level;
  protected LiteralEntry previous;

  LiteralEntry (String id, int level, LiteralEntry previous) {
    this.id = id;
    this.level = level;
    this.previous = previous;
  }
}
