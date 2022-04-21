// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the storage blob based dead letter destination.
 * 
 */
public final class StorageBlobDeadLetterDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageBlobDeadLetterDestinationArgs Empty = new StorageBlobDeadLetterDestinationArgs();

    /**
     * The name of the Storage blob container that is the destination of the deadletter events
     * 
     */
    @Import(name="blobContainerName")
    private @Nullable Output<String> blobContainerName;

    public Optional<Output<String>> blobContainerName() {
        return Optional.ofNullable(this.blobContainerName);
    }

    /**
     * Type of the endpoint for the dead letter destination
     * Expected value is &#39;StorageBlob&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource ID of the storage account that is the destination of the deadletter events
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private StorageBlobDeadLetterDestinationArgs() {}

    private StorageBlobDeadLetterDestinationArgs(StorageBlobDeadLetterDestinationArgs $) {
        this.blobContainerName = $.blobContainerName;
        this.endpointType = $.endpointType;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageBlobDeadLetterDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageBlobDeadLetterDestinationArgs $;

        public Builder() {
            $ = new StorageBlobDeadLetterDestinationArgs();
        }

        public Builder(StorageBlobDeadLetterDestinationArgs defaults) {
            $ = new StorageBlobDeadLetterDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder blobContainerName(@Nullable Output<String> blobContainerName) {
            $.blobContainerName = blobContainerName;
            return this;
        }

        public Builder blobContainerName(String blobContainerName) {
            return blobContainerName(Output.of(blobContainerName));
        }

        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public StorageBlobDeadLetterDestinationArgs build() {
            $.endpointType = Codegen.stringProp("endpointType").output().arg($.endpointType).require();
            return $;
        }
    }

}
