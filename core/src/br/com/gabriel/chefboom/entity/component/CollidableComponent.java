package br.com.gabriel.chefboom.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.math.Rectangle;

public class CollidableComponent extends Component {

    public final Rectangle collisionBox = new Rectangle();

    //Verficicação das 4 direções
    public boolean onGround;

    public boolean onCeiling;

    public boolean onLeftWall;

    public boolean onRightWall;
}
