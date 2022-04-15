// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderArgs Empty = new GetFolderArgs();

    @Import(name="folderId", required=true)
      private final String folderId;

    public String folderId() {
        return this.folderId;
    }

    public GetFolderArgs(String folderId) {
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
    }

    private GetFolderArgs() {
        this.folderId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folderId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
        }

        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }        public GetFolderArgs build() {
            return new GetFolderArgs(folderId);
        }
    }
}
