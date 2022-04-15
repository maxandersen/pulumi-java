// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Access Control List (ACL) for an iSCSI target portal group
 * 
 */
public final class AclArgs extends io.pulumi.resources.ResourceArgs {

    public static final AclArgs Empty = new AclArgs();

    /**
     * iSCSI initiator IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:client".
     * 
     */
    @Import(name="initiatorIqn", required=true)
      private final Output<String> initiatorIqn;

    public Output<String> initiatorIqn() {
        return this.initiatorIqn;
    }

    /**
     * List of LUN names mapped to the ACL.
     * 
     */
    @Import(name="mappedLuns", required=true)
      private final Output<List<String>> mappedLuns;

    public Output<List<String>> mappedLuns() {
        return this.mappedLuns;
    }

    /**
     * Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public AclArgs(
        Output<String> initiatorIqn,
        Output<List<String>> mappedLuns,
        Output<String> password,
        Output<String> username) {
        this.initiatorIqn = Objects.requireNonNull(initiatorIqn, "expected parameter 'initiatorIqn' to be non-null");
        this.mappedLuns = Objects.requireNonNull(mappedLuns, "expected parameter 'mappedLuns' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private AclArgs() {
        this.initiatorIqn = Codegen.empty();
        this.mappedLuns = Codegen.empty();
        this.password = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> initiatorIqn;
        private Output<List<String>> mappedLuns;
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(AclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initiatorIqn = defaults.initiatorIqn;
    	      this.mappedLuns = defaults.mappedLuns;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder initiatorIqn(Output<String> initiatorIqn) {
            this.initiatorIqn = Objects.requireNonNull(initiatorIqn);
            return this;
        }
        public Builder initiatorIqn(String initiatorIqn) {
            this.initiatorIqn = Output.of(Objects.requireNonNull(initiatorIqn));
            return this;
        }
        public Builder mappedLuns(Output<List<String>> mappedLuns) {
            this.mappedLuns = Objects.requireNonNull(mappedLuns);
            return this;
        }
        public Builder mappedLuns(List<String> mappedLuns) {
            this.mappedLuns = Output.of(Objects.requireNonNull(mappedLuns));
            return this;
        }
        public Builder mappedLuns(String... mappedLuns) {
            return mappedLuns(List.of(mappedLuns));
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public AclArgs build() {
            return new AclArgs(initiatorIqn, mappedLuns, password, username);
        }
    }
}
