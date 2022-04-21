// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductState extends com.pulumi.resources.ResourceArgs {

    public static final ProductState Empty = new ProductState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * ARN of the product.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Time when the product was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

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
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @Import(name="distributor")
    private @Nullable Output<String> distributor;

    public Optional<Output<String>> distributor() {
        return Optional.ofNullable(this.distributor);
    }

    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    @Import(name="hasDefaultPath")
    private @Nullable Output<Boolean> hasDefaultPath;

    public Optional<Output<Boolean>> hasDefaultPath() {
        return Optional.ofNullable(this.hasDefaultPath);
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
     * Owner of the product.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @Import(name="provisioningArtifactParameters")
    private @Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters;

    public Optional<Output<ProductProvisioningArtifactParametersGetArgs>> provisioningArtifactParameters() {
        return Optional.ofNullable(this.provisioningArtifactParameters);
    }

    /**
     * Status of the product.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Support information about the product.
     * 
     */
    @Import(name="supportDescription")
    private @Nullable Output<String> supportDescription;

    public Optional<Output<String>> supportDescription() {
        return Optional.ofNullable(this.supportDescription);
    }

    /**
     * Contact email for product support.
     * 
     */
    @Import(name="supportEmail")
    private @Nullable Output<String> supportEmail;

    public Optional<Output<String>> supportEmail() {
        return Optional.ofNullable(this.supportEmail);
    }

    /**
     * Contact URL for product support.
     * 
     */
    @Import(name="supportUrl")
    private @Nullable Output<String> supportUrl;

    public Optional<Output<String>> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    /**
     * Tags to apply to the product. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
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

    private ProductState() {}

    private ProductState(ProductState $) {
        this.acceptLanguage = $.acceptLanguage;
        this.arn = $.arn;
        this.createdTime = $.createdTime;
        this.description = $.description;
        this.distributor = $.distributor;
        this.hasDefaultPath = $.hasDefaultPath;
        this.name = $.name;
        this.owner = $.owner;
        this.provisioningArtifactParameters = $.provisioningArtifactParameters;
        this.status = $.status;
        this.supportDescription = $.supportDescription;
        this.supportEmail = $.supportEmail;
        this.supportUrl = $.supportUrl;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductState $;

        public Builder() {
            $ = new ProductState();
        }

        public Builder(ProductState defaults) {
            $ = new ProductState(Objects.requireNonNull(defaults));
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder distributor(@Nullable Output<String> distributor) {
            $.distributor = distributor;
            return this;
        }

        public Builder distributor(String distributor) {
            return distributor(Output.of(distributor));
        }

        public Builder hasDefaultPath(@Nullable Output<Boolean> hasDefaultPath) {
            $.hasDefaultPath = hasDefaultPath;
            return this;
        }

        public Builder hasDefaultPath(Boolean hasDefaultPath) {
            return hasDefaultPath(Output.of(hasDefaultPath));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder provisioningArtifactParameters(@Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters) {
            $.provisioningArtifactParameters = provisioningArtifactParameters;
            return this;
        }

        public Builder provisioningArtifactParameters(ProductProvisioningArtifactParametersGetArgs provisioningArtifactParameters) {
            return provisioningArtifactParameters(Output.of(provisioningArtifactParameters));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder supportDescription(@Nullable Output<String> supportDescription) {
            $.supportDescription = supportDescription;
            return this;
        }

        public Builder supportDescription(String supportDescription) {
            return supportDescription(Output.of(supportDescription));
        }

        public Builder supportEmail(@Nullable Output<String> supportEmail) {
            $.supportEmail = supportEmail;
            return this;
        }

        public Builder supportEmail(String supportEmail) {
            return supportEmail(Output.of(supportEmail));
        }

        public Builder supportUrl(@Nullable Output<String> supportUrl) {
            $.supportUrl = supportUrl;
            return this;
        }

        public Builder supportUrl(String supportUrl) {
            return supportUrl(Output.of(supportUrl));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProductState build() {
            return $;
        }
    }

}
