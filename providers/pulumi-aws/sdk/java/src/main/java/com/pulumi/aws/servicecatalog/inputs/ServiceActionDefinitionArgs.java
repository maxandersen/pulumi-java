// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceActionDefinitionArgs Empty = new ServiceActionDefinitionArgs();

    /**
     * ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
     * 
     */
    @Import(name="assumeRole")
      private final @Nullable Output<String> assumeRole;

    public Output<String> assumeRole() {
        return this.assumeRole == null ? Codegen.empty() : this.assumeRole;
    }

    /**
     * Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<String> parameters;

    public Output<String> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * SSM document version. For example, `1`.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public ServiceActionDefinitionArgs(
        @Nullable Output<String> assumeRole,
        Output<String> name,
        @Nullable Output<String> parameters,
        @Nullable Output<String> type,
        Output<String> version) {
        this.assumeRole = assumeRole;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.type = type;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ServiceActionDefinitionArgs() {
        this.assumeRole = Codegen.empty();
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> assumeRole;
        private Output<String> name;
        private @Nullable Output<String> parameters;
        private @Nullable Output<String> type;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRole = defaults.assumeRole;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder assumeRole(@Nullable Output<String> assumeRole) {
            this.assumeRole = assumeRole;
            return this;
        }
        public Builder assumeRole(@Nullable String assumeRole) {
            this.assumeRole = Codegen.ofNullable(assumeRole);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public ServiceActionDefinitionArgs build() {
            return new ServiceActionDefinitionArgs(assumeRole, name, parameters, type, version);
        }
    }
}
