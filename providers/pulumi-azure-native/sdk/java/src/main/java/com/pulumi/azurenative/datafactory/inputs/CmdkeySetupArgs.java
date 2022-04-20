// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
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
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password;
    }

    /**
     * The server name of data source access.
     * 
     */
    @Import(name="targetName", required=true)
      private final Output<Object> targetName;

    public Output<Object> targetName() {
        return this.targetName;
    }

    /**
     * The type of custom setup.
     * Expected value is &#39;CmdkeySetup&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The user name of data source access.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<Object> userName;

    public Output<Object> userName() {
        return this.userName;
    }

    public CmdkeySetupArgs(
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<Object> targetName,
        Output<String> type,
        Output<Object> userName) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private CmdkeySetupArgs() {
        this.password = Codegen.empty();
        this.targetName = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmdkeySetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<Object> targetName;
        private Output<String> type;
        private Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CmdkeySetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.targetName = defaults.targetName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder password(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder targetName(Output<Object> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }
        public Builder targetName(Object targetName) {
            this.targetName = Output.of(Objects.requireNonNull(targetName));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(Output<Object> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(Object userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public CmdkeySetupArgs build() {
            return new CmdkeySetupArgs(password, targetName, type, userName);
        }
    }
}
