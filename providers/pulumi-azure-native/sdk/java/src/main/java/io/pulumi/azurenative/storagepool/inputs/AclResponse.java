// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Access Control List (ACL) for an iSCSI target portal group
 * 
 */
public final class AclResponse extends io.pulumi.resources.InvokeArgs {

    public static final AclResponse Empty = new AclResponse();

    /**
     * iSCSI initiator IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:client".
     * 
     */
    @Import(name="initiatorIqn", required=true)
      private final String initiatorIqn;

    public String initiatorIqn() {
        return this.initiatorIqn;
    }

    /**
     * List of LUN names mapped to the ACL.
     * 
     */
    @Import(name="mappedLuns", required=true)
      private final List<String> mappedLuns;

    public List<String> mappedLuns() {
        return this.mappedLuns;
    }

    /**
     * Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String password() {
        return this.password;
    }

    /**
     * Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String username() {
        return this.username;
    }

    public AclResponse(
        String initiatorIqn,
        List<String> mappedLuns,
        String password,
        String username) {
        this.initiatorIqn = Objects.requireNonNull(initiatorIqn, "expected parameter 'initiatorIqn' to be non-null");
        this.mappedLuns = Objects.requireNonNull(mappedLuns, "expected parameter 'mappedLuns' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private AclResponse() {
        this.initiatorIqn = null;
        this.mappedLuns = List.of();
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String initiatorIqn;
        private List<String> mappedLuns;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(AclResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initiatorIqn = defaults.initiatorIqn;
    	      this.mappedLuns = defaults.mappedLuns;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder initiatorIqn(String initiatorIqn) {
            this.initiatorIqn = Objects.requireNonNull(initiatorIqn);
            return this;
        }
        public Builder mappedLuns(List<String> mappedLuns) {
            this.mappedLuns = Objects.requireNonNull(mappedLuns);
            return this;
        }
        public Builder mappedLuns(String... mappedLuns) {
            return mappedLuns(List.of(mappedLuns));
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public AclResponse build() {
            return new AclResponse(initiatorIqn, mappedLuns, password, username);
        }
    }
}
