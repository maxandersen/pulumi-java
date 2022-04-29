// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Access Control List (ACL) for an iSCSI target portal group
 * 
 */
public final class AclArgs extends ResourceArgs {

    public static final AclArgs Empty = new AclArgs();

    /**
     * iSCSI initiator IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:client&#34;.
     * 
     */
    @Import(name="initiatorIqn", required=true)
    private Output<String> initiatorIqn;

    /**
     * @return iSCSI initiator IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:client&#34;.
     * 
     */
    public Output<String> initiatorIqn() {
        return this.initiatorIqn;
    }

    /**
     * List of LUN names mapped to the ACL.
     * 
     */
    @Import(name="mappedLuns", required=true)
    private Output<List<String>> mappedLuns;

    /**
     * @return List of LUN names mapped to the ACL.
     * 
     */
    public Output<List<String>> mappedLuns() {
        return this.mappedLuns;
    }

    /**
     * Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private AclArgs() {}

    private AclArgs(AclArgs $) {
        this.initiatorIqn = $.initiatorIqn;
        this.mappedLuns = $.mappedLuns;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclArgs $;

        public Builder() {
            $ = new AclArgs();
        }

        public Builder(AclArgs defaults) {
            $ = new AclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initiatorIqn iSCSI initiator IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:client&#34;.
         * 
         * @return builder
         * 
         */
        public Builder initiatorIqn(Output<String> initiatorIqn) {
            $.initiatorIqn = initiatorIqn;
            return this;
        }

        /**
         * @param initiatorIqn iSCSI initiator IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:client&#34;.
         * 
         * @return builder
         * 
         */
        public Builder initiatorIqn(String initiatorIqn) {
            return initiatorIqn(Output.of(initiatorIqn));
        }

        /**
         * @param mappedLuns List of LUN names mapped to the ACL.
         * 
         * @return builder
         * 
         */
        public Builder mappedLuns(Output<List<String>> mappedLuns) {
            $.mappedLuns = mappedLuns;
            return this;
        }

        /**
         * @param mappedLuns List of LUN names mapped to the ACL.
         * 
         * @return builder
         * 
         */
        public Builder mappedLuns(List<String> mappedLuns) {
            return mappedLuns(Output.of(mappedLuns));
        }

        /**
         * @param mappedLuns List of LUN names mapped to the ACL.
         * 
         * @return builder
         * 
         */
        public Builder mappedLuns(String... mappedLuns) {
            return mappedLuns(List.of(mappedLuns));
        }

        /**
         * @param password Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for Challenge Handshake Authentication Protocol (CHAP) authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for Challenge Handshake Authentication Protocol (CHAP) authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AclArgs build() {
            $.initiatorIqn = Objects.requireNonNull($.initiatorIqn, "expected parameter 'initiatorIqn' to be non-null");
            $.mappedLuns = Objects.requireNonNull($.mappedLuns, "expected parameter 'mappedLuns' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
