package starterpack.player;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
public class StatSet {
  private int maxHealth;
  private int damage;
  private int speed;
  private int range;

  @JsonCreator
  public StatSet(@JsonProperty("maxHealth") int maxHealth, @JsonProperty("damage") int damage, @JsonProperty("speed") int speed, @JsonProperty("range") int range) {
    this.maxHealth = maxHealth;
    this.damage = damage;
    this.speed = speed;
    this.range = range;
  }

  /**
   * Adds two StatSets.
   *
   * @param other The StatSet to be summed with this StatSet.
   * @return Sum StatSet.
   */
  public StatSet plus(StatSet other){
    return new StatSet(
        this.maxHealth + other.maxHealth,
        this.damage + other.damage,
        this.speed + other.speed,
        this.range + other.range
    );
  }

  public int getMaxHealth() {
    return maxHealth;
  }

  public int getDamage() {
    return damage;
  }

  public int getSpeed() {
    return speed;
  }

  public int getRange() {
    return range;
  }
}
