// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductProvisioningArtifactParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductProvisioningArtifactParametersArgs Empty = new ProductProvisioningArtifactParametersArgs();

    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    @Import(name="disableTemplateValidation")
    private @Nullable Output<Boolean> disableTemplateValidation;

    public Optional<Output<Boolean>> disableTemplateValidation() {
        return Optional.ofNullable(this.disableTemplateValidation);
    }

    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    @Import(name="templatePhysicalId")
    private @Nullable Output<String> templatePhysicalId;

    public Optional<Output<String>> templatePhysicalId() {
        return Optional.ofNullable(this.templatePhysicalId);
    }

    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
     */
    @Import(name="templateUrl")
    private @Nullable Output<String> templateUrl;

    public Optional<Output<String>> templateUrl() {
        return Optional.ofNullable(this.templateUrl);
    }

    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ProductProvisioningArtifactParametersArgs() {}

    private ProductProvisioningArtifactParametersArgs(ProductProvisioningArtifactParametersArgs $) {
        this.description = $.description;
        this.disableTemplateValidation = $.disableTemplateValidation;
        this.name = $.name;
        this.templatePhysicalId = $.templatePhysicalId;
        this.templateUrl = $.templateUrl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductProvisioningArtifactParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductProvisioningArtifactParametersArgs $;

        public Builder() {
            $ = new ProductProvisioningArtifactParametersArgs();
        }

        public Builder(ProductProvisioningArtifactParametersArgs defaults) {
            $ = new ProductProvisioningArtifactParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disableTemplateValidation(@Nullable Output<Boolean> disableTemplateValidation) {
            $.disableTemplateValidation = disableTemplateValidation;
            return this;
        }

        public Builder disableTemplateValidation(Boolean disableTemplateValidation) {
            return disableTemplateValidation(Output.of(disableTemplateValidation));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder templatePhysicalId(@Nullable Output<String> templatePhysicalId) {
            $.templatePhysicalId = templatePhysicalId;
            return this;
        }

        public Builder templatePhysicalId(String templatePhysicalId) {
            return templatePhysicalId(Output.of(templatePhysicalId));
        }

        public Builder templateUrl(@Nullable Output<String> templateUrl) {
            $.templateUrl = templateUrl;
            return this;
        }

        public Builder templateUrl(String templateUrl) {
            return templateUrl(Output.of(templateUrl));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProductProvisioningArtifactParametersArgs build() {
            return $;
        }
    }

}
