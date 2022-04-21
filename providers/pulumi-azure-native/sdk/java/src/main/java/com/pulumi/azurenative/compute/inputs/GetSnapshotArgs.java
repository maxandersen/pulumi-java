// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the snapshot that is being created. The name can&#39;t be changed after the snapshot is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * 
     */
    @Import(name="snapshotName", required=true)
    private String snapshotName;

    public String snapshotName() {
        return this.snapshotName;
    }

    private GetSnapshotArgs() {}

    private GetSnapshotArgs(GetSnapshotArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.snapshotName = $.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotArgs $;

        public Builder() {
            $ = new GetSnapshotArgs();
        }

        public Builder(GetSnapshotArgs defaults) {
            $ = new GetSnapshotArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder snapshotName(String snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        public GetSnapshotArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.snapshotName = Objects.requireNonNull($.snapshotName, "expected parameter 'snapshotName' to be non-null");
            return $;
        }
    }

}
