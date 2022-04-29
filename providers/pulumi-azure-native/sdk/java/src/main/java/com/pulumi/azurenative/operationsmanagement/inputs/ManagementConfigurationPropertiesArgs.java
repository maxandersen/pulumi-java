// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.azurenative.operationsmanagement.inputs.ArmTemplateParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ManagementConfiguration properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementConfigurationPropertiesArgs extends ResourceArgs {

    public static final ManagementConfigurationPropertiesArgs Empty = new ManagementConfigurationPropertiesArgs();

    /**
     * The applicationId of the appliance for this Management.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The applicationId of the appliance for this Management.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Parameters to run the ARM template
     * 
     */
    @Import(name="parameters", required=true)
    private Output<List<ArmTemplateParameterArgs>> parameters;

    /**
     * @return Parameters to run the ARM template
     * 
     */
    public Output<List<ArmTemplateParameterArgs>> parameters() {
        return this.parameters;
    }

    /**
     * The type of the parent resource.
     * 
     */
    @Import(name="parentResourceType", required=true)
    private Output<String> parentResourceType;

    /**
     * @return The type of the parent resource.
     * 
     */
    public Output<String> parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The Json object containing the ARM template to deploy
     * 
     */
    @Import(name="template", required=true)
    private Output<Object> template;

    /**
     * @return The Json object containing the ARM template to deploy
     * 
     */
    public Output<Object> template() {
        return this.template;
    }

    private ManagementConfigurationPropertiesArgs() {}

    private ManagementConfigurationPropertiesArgs(ManagementConfigurationPropertiesArgs $) {
        this.applicationId = $.applicationId;
        this.parameters = $.parameters;
        this.parentResourceType = $.parentResourceType;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementConfigurationPropertiesArgs $;

        public Builder() {
            $ = new ManagementConfigurationPropertiesArgs();
        }

        public Builder(ManagementConfigurationPropertiesArgs defaults) {
            $ = new ManagementConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The applicationId of the appliance for this Management.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The applicationId of the appliance for this Management.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param parameters Parameters to run the ARM template
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<List<ArmTemplateParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters to run the ARM template
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ArmTemplateParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Parameters to run the ARM template
         * 
         * @return builder
         * 
         */
        public Builder parameters(ArmTemplateParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param parentResourceType The type of the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(Output<String> parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        /**
         * @param parentResourceType The type of the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(String parentResourceType) {
            return parentResourceType(Output.of(parentResourceType));
        }

        /**
         * @param template The Json object containing the ARM template to deploy
         * 
         * @return builder
         * 
         */
        public Builder template(Output<Object> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The Json object containing the ARM template to deploy
         * 
         * @return builder
         * 
         */
        public Builder template(Object template) {
            return template(Output.of(template));
        }

        public ManagementConfigurationPropertiesArgs build() {
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
