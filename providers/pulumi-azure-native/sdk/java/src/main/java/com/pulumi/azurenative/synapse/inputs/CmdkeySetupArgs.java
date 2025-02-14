// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.SecureStringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of running cmdkey commands.
 * 
 */
public final class CmdkeySetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final CmdkeySetupArgs Empty = new CmdkeySetupArgs();

    /**
     * The password of data source access.
     * 
     */
    @Import(name="password", required=true)
    private Output<SecureStringArgs> password;

    /**
     * @return The password of data source access.
     * 
     */
    public Output<SecureStringArgs> password() {
        return this.password;
    }

    /**
     * The server name of data source access.
     * 
     */
    @Import(name="targetName", required=true)
    private Output<Object> targetName;

    /**
     * @return The server name of data source access.
     * 
     */
    public Output<Object> targetName() {
        return this.targetName;
    }

    /**
     * The type of custom setup.
     * Expected value is &#39;CmdkeySetup&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of custom setup.
     * Expected value is &#39;CmdkeySetup&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The user name of data source access.
     * 
     */
    @Import(name="userName", required=true)
    private Output<Object> userName;

    /**
     * @return The user name of data source access.
     * 
     */
    public Output<Object> userName() {
        return this.userName;
    }

    private CmdkeySetupArgs() {}

    private CmdkeySetupArgs(CmdkeySetupArgs $) {
        this.password = $.password;
        this.targetName = $.targetName;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CmdkeySetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CmdkeySetupArgs $;

        public Builder() {
            $ = new CmdkeySetupArgs();
        }

        public Builder(CmdkeySetupArgs defaults) {
            $ = new CmdkeySetupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password of data source access.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<SecureStringArgs> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of data source access.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Output.of(password));
        }

        /**
         * @param targetName The server name of data source access.
         * 
         * @return builder
         * 
         */
        public Builder targetName(Output<Object> targetName) {
            $.targetName = targetName;
            return this;
        }

        /**
         * @param targetName The server name of data source access.
         * 
         * @return builder
         * 
         */
        public Builder targetName(Object targetName) {
            return targetName(Output.of(targetName));
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;CmdkeySetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;CmdkeySetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userName The user name of data source access.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name of data source access.
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public CmdkeySetupArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.targetName = Objects.requireNonNull($.targetName, "expected parameter 'targetName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
