/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * glassfish/bootstrap/legal/CDDLv1.0.txt or
 * https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * glassfish/bootstrap/legal/CDDLv1.0.txt.  If applicable,
 * add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your
 * own identifying information: Portions Copyright [yyyy]
 * [name of copyright owner]
 */


import java.io.Serializable;
import javax.persistence.*;

import static javax.persistence.CascadeType.*;

import java.util.Collection;
import java.util.ArrayList;

/**
 * @author TBCY-Boys
 */

@Entity
@Table(name="CUSTOMER_TABLE")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 909683577578325087L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(cascade=ALL)
    private Collection<Address> addresses = new ArrayList<Address>();
    
    public enum Status {ledig, verheiratet, geschieden, verwitwet, homo};
    @Enumerated(EnumType.STRING)
    Status status;
	boolean VIP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Address> getAdresses() {
        return addresses;
    }

    public void setAdresses(Collection<Address> newValue) {
        this.addresses = newValue;
    }

    public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isVIP() {
		return VIP;
	}

	public void setVIP(boolean vIP) {
		VIP = vIP;
	}
    
}
