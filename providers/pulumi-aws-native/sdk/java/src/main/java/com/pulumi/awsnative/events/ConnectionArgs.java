// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events;

import com.pulumi.awsnative.events.enums.ConnectionAuthorizationType;
import com.pulumi.awsnative.events.inputs.AuthParametersPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    @Import(name="authParameters", required=true)
      private final Output<AuthParametersPropertiesArgs> authParameters;

    public Output<AuthParametersPropertiesArgs> authParameters() {
        return this.authParameters;
    }

    @Import(name="authorizationType", required=true)
      private final Output<ConnectionAuthorizationType> authorizationType;

    public Output<ConnectionAuthorizationType> authorizationType() {
        return this.authorizationType;
    }

    /**
     * Description of the connection.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the connection.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ConnectionArgs(
        Output<AuthParametersPropertiesArgs> authParameters,
        Output<ConnectionAuthorizationType> authorizationType,
        @Nullable Output<String> description,
        @Nullable Output<String> name) {
        this.authParameters = Objects.requireNonNull(authParameters, "expected parameter 'authParameters' to be non-null");
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.description = description;
        this.name = name;
    }

    private ConnectionArgs() {
        this.authParameters = Codegen.empty();
        this.authorizationType = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AuthParametersPropertiesArgs> authParameters;
        private Output<ConnectionAuthorizationType> authorizationType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authParameters = defaults.authParameters;
    	      this.authorizationType = defaults.authorizationType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder authParameters(Output<AuthParametersPropertiesArgs> authParameters) {
            this.authParameters = Objects.requireNonNull(authParameters);
            return this;
        }
        public Builder authParameters(AuthParametersPropertiesArgs authParameters) {
            this.authParameters = Output.of(Objects.requireNonNull(authParameters));
            return this;
        }
        public Builder authorizationType(Output<ConnectionAuthorizationType> authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder authorizationType(ConnectionAuthorizationType authorizationType) {
            this.authorizationType = Output.of(Objects.requireNonNull(authorizationType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(authParameters, authorizationType, description, name);
        }
    }
}
