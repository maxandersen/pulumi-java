// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.azurenative.resources.enums.DeploymentMode;
import com.pulumi.azurenative.resources.inputs.DebugSettingArgs;
import com.pulumi.azurenative.resources.inputs.ExpressionEvaluationOptionsArgs;
import com.pulumi.azurenative.resources.inputs.OnErrorDeploymentArgs;
import com.pulumi.azurenative.resources.inputs.ParametersLinkArgs;
import com.pulumi.azurenative.resources.inputs.TemplateLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment properties.
 * 
 */
public final class DeploymentPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentPropertiesArgs Empty = new DeploymentPropertiesArgs();

    /**
     * The debug setting of the deployment.
     * 
     */
    @Import(name="debugSetting")
    private @Nullable Output<DebugSettingArgs> debugSetting;

    public Optional<Output<DebugSettingArgs>> debugSetting() {
        return Optional.ofNullable(this.debugSetting);
    }

    /**
     * Specifies whether template expressions are evaluated within the scope of the parent template or nested template. Only applicable to nested templates. If not specified, default value is outer.
     * 
     */
    @Import(name="expressionEvaluationOptions")
    private @Nullable Output<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions;

    public Optional<Output<ExpressionEvaluationOptionsArgs>> expressionEvaluationOptions() {
        return Optional.ofNullable(this.expressionEvaluationOptions);
    }

    /**
     * The mode that is used to deploy resources. This value can be either Incremental or Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included in the template. In Complete mode, resources are deployed and existing resources in the resource group that are not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete resources.
     * 
     */
    @Import(name="mode", required=true)
    private Output<DeploymentMode> mode;

    public Output<DeploymentMode> mode() {
        return this.mode;
    }

    /**
     * The deployment on error behavior.
     * 
     */
    @Import(name="onErrorDeployment")
    private @Nullable Output<OnErrorDeploymentArgs> onErrorDeployment;

    public Optional<Output<OnErrorDeploymentArgs>> onErrorDeployment() {
        return Optional.ofNullable(this.onErrorDeployment);
    }

    /**
     * Name and value pairs that define the deployment parameters for the template. You use this element when you want to provide the parameter values directly in the request rather than link to an existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can be a JObject or a well formed JSON string.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Object> parameters;

    public Optional<Output<Object>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The URI of parameters file. You use this element to link to an existing parameters file. Use either the parametersLink property or the parameters property, but not both.
     * 
     */
    @Import(name="parametersLink")
    private @Nullable Output<ParametersLinkArgs> parametersLink;

    public Optional<Output<ParametersLinkArgs>> parametersLink() {
        return Optional.ofNullable(this.parametersLink);
    }

    /**
     * The template content. You use this element when you want to pass the template syntax directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the template property, but not both.
     * 
     */
    @Import(name="template")
    private @Nullable Output<Object> template;

    public Optional<Output<Object>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The URI of the template. Use either the templateLink property or the template property, but not both.
     * 
     */
    @Import(name="templateLink")
    private @Nullable Output<TemplateLinkArgs> templateLink;

    public Optional<Output<TemplateLinkArgs>> templateLink() {
        return Optional.ofNullable(this.templateLink);
    }

    private DeploymentPropertiesArgs() {}

    private DeploymentPropertiesArgs(DeploymentPropertiesArgs $) {
        this.debugSetting = $.debugSetting;
        this.expressionEvaluationOptions = $.expressionEvaluationOptions;
        this.mode = $.mode;
        this.onErrorDeployment = $.onErrorDeployment;
        this.parameters = $.parameters;
        this.parametersLink = $.parametersLink;
        this.template = $.template;
        this.templateLink = $.templateLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentPropertiesArgs $;

        public Builder() {
            $ = new DeploymentPropertiesArgs();
        }

        public Builder(DeploymentPropertiesArgs defaults) {
            $ = new DeploymentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder debugSetting(@Nullable Output<DebugSettingArgs> debugSetting) {
            $.debugSetting = debugSetting;
            return this;
        }

        public Builder debugSetting(DebugSettingArgs debugSetting) {
            return debugSetting(Output.of(debugSetting));
        }

        public Builder expressionEvaluationOptions(@Nullable Output<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions) {
            $.expressionEvaluationOptions = expressionEvaluationOptions;
            return this;
        }

        public Builder expressionEvaluationOptions(ExpressionEvaluationOptionsArgs expressionEvaluationOptions) {
            return expressionEvaluationOptions(Output.of(expressionEvaluationOptions));
        }

        public Builder mode(Output<DeploymentMode> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(DeploymentMode mode) {
            return mode(Output.of(mode));
        }

        public Builder onErrorDeployment(@Nullable Output<OnErrorDeploymentArgs> onErrorDeployment) {
            $.onErrorDeployment = onErrorDeployment;
            return this;
        }

        public Builder onErrorDeployment(OnErrorDeploymentArgs onErrorDeployment) {
            return onErrorDeployment(Output.of(onErrorDeployment));
        }

        public Builder parameters(@Nullable Output<Object> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Object parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parametersLink(@Nullable Output<ParametersLinkArgs> parametersLink) {
            $.parametersLink = parametersLink;
            return this;
        }

        public Builder parametersLink(ParametersLinkArgs parametersLink) {
            return parametersLink(Output.of(parametersLink));
        }

        public Builder template(@Nullable Output<Object> template) {
            $.template = template;
            return this;
        }

        public Builder template(Object template) {
            return template(Output.of(template));
        }

        public Builder templateLink(@Nullable Output<TemplateLinkArgs> templateLink) {
            $.templateLink = templateLink;
            return this;
        }

        public Builder templateLink(TemplateLinkArgs templateLink) {
            return templateLink(Output.of(templateLink));
        }

        public DeploymentPropertiesArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
