package br.com.gabriel.chefboom.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.math.Vector2;

public class RigidBodyComponent extends Component {

    public final Vector2 velocity = new Vector2();

    public boolean isKinematic = true;
}
