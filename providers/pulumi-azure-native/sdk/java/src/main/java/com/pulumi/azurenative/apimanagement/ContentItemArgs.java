// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentItemArgs Empty = new ContentItemArgs();

    /**
     * Content item identifier.
     * 
     */
    @Import(name="contentItemId")
    private @Nullable Output<String> contentItemId;

    public Optional<Output<String>> contentItemId() {
        return Optional.ofNullable(this.contentItemId);
    }

    /**
     * Content type identifier.
     * 
     */
    @Import(name="contentTypeId", required=true)
    private Output<String> contentTypeId;

    public Output<String> contentTypeId() {
        return this.contentTypeId;
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

    private ContentItemArgs() {}

    private ContentItemArgs(ContentItemArgs $) {
        this.contentItemId = $.contentItemId;
        this.contentTypeId = $.contentTypeId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentItemArgs $;

        public Builder() {
            $ = new ContentItemArgs();
        }

        public Builder(ContentItemArgs defaults) {
            $ = new ContentItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentItemId(@Nullable Output<String> contentItemId) {
            $.contentItemId = contentItemId;
            return this;
        }

        public Builder contentItemId(String contentItemId) {
            return contentItemId(Output.of(contentItemId));
        }

        public Builder contentTypeId(Output<String> contentTypeId) {
            $.contentTypeId = contentTypeId;
            return this;
        }

        public Builder contentTypeId(String contentTypeId) {
            return contentTypeId(Output.of(contentTypeId));
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

        public ContentItemArgs build() {
            $.contentTypeId = Objects.requireNonNull($.contentTypeId, "expected parameter 'contentTypeId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
