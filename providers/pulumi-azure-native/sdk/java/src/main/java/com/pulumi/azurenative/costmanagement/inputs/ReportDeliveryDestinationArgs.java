// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the report.
 * 
 */
public final class ReportDeliveryDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportDeliveryDestinationArgs Empty = new ReportDeliveryDestinationArgs();

    /**
     * The name of the container where reports will be uploaded.
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    public Output<String> container() {
        return this.container;
    }

    /**
     * The resource id of the storage account where reports will be delivered.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where reports will be uploaded.
     * 
     */
    @Import(name="rootFolderPath")
    private @Nullable Output<String> rootFolderPath;

    public Optional<Output<String>> rootFolderPath() {
        return Optional.ofNullable(this.rootFolderPath);
    }

    private ReportDeliveryDestinationArgs() {}

    private ReportDeliveryDestinationArgs(ReportDeliveryDestinationArgs $) {
        this.container = $.container;
        this.resourceId = $.resourceId;
        this.rootFolderPath = $.rootFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDeliveryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDeliveryDestinationArgs $;

        public Builder() {
            $ = new ReportDeliveryDestinationArgs();
        }

        public Builder(ReportDeliveryDestinationArgs defaults) {
            $ = new ReportDeliveryDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        public Builder container(String container) {
            return container(Output.of(container));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder rootFolderPath(@Nullable Output<String> rootFolderPath) {
            $.rootFolderPath = rootFolderPath;
            return this;
        }

        public Builder rootFolderPath(String rootFolderPath) {
            return rootFolderPath(Output.of(rootFolderPath));
        }

        public ReportDeliveryDestinationArgs build() {
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
