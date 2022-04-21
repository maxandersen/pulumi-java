// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiTagDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiTagDescriptionArgs Empty = new ApiTagDescriptionArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Description of the Tag.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Description of the external resources describing the tag.
     * 
     */
    @Import(name="externalDocsDescription")
    private @Nullable Output<String> externalDocsDescription;

    public Optional<Output<String>> externalDocsDescription() {
        return Optional.ofNullable(this.externalDocsDescription);
    }

    /**
     * Absolute URL of external resources describing the tag.
     * 
     */
    @Import(name="externalDocsUrl")
    private @Nullable Output<String> externalDocsUrl;

    public Optional<Output<String>> externalDocsUrl() {
        return Optional.ofNullable(this.externalDocsUrl);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Tag description identifier. Used when creating tagDescription for API/Tag association. Based on API and Tag names.
     * 
     */
    @Import(name="tagDescriptionId")
    private @Nullable Output<String> tagDescriptionId;

    public Optional<Output<String>> tagDescriptionId() {
        return Optional.ofNullable(this.tagDescriptionId);
    }

    private ApiTagDescriptionArgs() {}

    private ApiTagDescriptionArgs(ApiTagDescriptionArgs $) {
        this.apiId = $.apiId;
        this.description = $.description;
        this.externalDocsDescription = $.externalDocsDescription;
        this.externalDocsUrl = $.externalDocsUrl;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.tagDescriptionId = $.tagDescriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiTagDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiTagDescriptionArgs $;

        public Builder() {
            $ = new ApiTagDescriptionArgs();
        }

        public Builder(ApiTagDescriptionArgs defaults) {
            $ = new ApiTagDescriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder externalDocsDescription(@Nullable Output<String> externalDocsDescription) {
            $.externalDocsDescription = externalDocsDescription;
            return this;
        }

        public Builder externalDocsDescription(String externalDocsDescription) {
            return externalDocsDescription(Output.of(externalDocsDescription));
        }

        public Builder externalDocsUrl(@Nullable Output<String> externalDocsUrl) {
            $.externalDocsUrl = externalDocsUrl;
            return this;
        }

        public Builder externalDocsUrl(String externalDocsUrl) {
            return externalDocsUrl(Output.of(externalDocsUrl));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder tagDescriptionId(@Nullable Output<String> tagDescriptionId) {
            $.tagDescriptionId = tagDescriptionId;
            return this;
        }

        public Builder tagDescriptionId(String tagDescriptionId) {
            return tagDescriptionId(Output.of(tagDescriptionId));
        }

        public ApiTagDescriptionArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
