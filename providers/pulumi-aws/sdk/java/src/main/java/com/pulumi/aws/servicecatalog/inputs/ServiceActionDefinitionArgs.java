// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceActionDefinitionArgs Empty = new ServiceActionDefinitionArgs();

    /**
     * ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
     * 
     */
    @Import(name="assumeRole")
    private @Nullable Output<String> assumeRole;

    /**
     * @return ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
     * 
     */
    public Optional<Output<String>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * SSM document version. For example, `1`.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return SSM document version. For example, `1`.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ServiceActionDefinitionArgs() {}

    private ServiceActionDefinitionArgs(ServiceActionDefinitionArgs $) {
        this.assumeRole = $.assumeRole;
        this.name = $.name;
        this.parameters = $.parameters;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceActionDefinitionArgs $;

        public Builder() {
            $ = new ServiceActionDefinitionArgs();
        }

        public Builder(ServiceActionDefinitionArgs defaults) {
            $ = new ServiceActionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assumeRole ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(@Nullable Output<String> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        /**
         * @param assumeRole ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(String assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param name Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param type Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version SSM document version. For example, `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version SSM document version. For example, `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ServiceActionDefinitionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
