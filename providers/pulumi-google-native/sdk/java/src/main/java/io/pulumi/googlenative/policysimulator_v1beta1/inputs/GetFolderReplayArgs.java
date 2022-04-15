// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderReplayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderReplayArgs Empty = new GetFolderReplayArgs();

    @Import(name="folderId", required=true)
      private final String folderId;

    public String folderId() {
        return this.folderId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="replayId", required=true)
      private final String replayId;

    public String replayId() {
        return this.replayId;
    }

    public GetFolderReplayArgs(
        String folderId,
        String location,
        String replayId) {
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.replayId = Objects.requireNonNull(replayId, "expected parameter 'replayId' to be non-null");
    }

    private GetFolderReplayArgs() {
        this.folderId = null;
        this.location = null;
        this.replayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folderId;
        private String location;
        private String replayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.location = defaults.location;
    	      this.replayId = defaults.replayId;
        }

        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder replayId(String replayId) {
            this.replayId = Objects.requireNonNull(replayId);
            return this;
        }        public GetFolderReplayArgs build() {
            return new GetFolderReplayArgs(folderId, location, replayId);
        }
    }
}
