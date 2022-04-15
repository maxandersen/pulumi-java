// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListRunLogSasUrlResult {
    /**
     * The link to logs in registry for a run on a azure container registry.
     * 
     */
    private final @Nullable String logArtifactLink;
    /**
     * The link to logs for a run on a azure container registry.
     * 
     */
    private final @Nullable String logLink;

    @CustomType.Constructor
    private ListRunLogSasUrlResult(
        @CustomType.Parameter("logArtifactLink") @Nullable String logArtifactLink,
        @CustomType.Parameter("logLink") @Nullable String logLink) {
        this.logArtifactLink = logArtifactLink;
        this.logLink = logLink;
    }

    /**
     * The link to logs in registry for a run on a azure container registry.
     * 
    */
    public Optional<String> logArtifactLink() {
        return Optional.ofNullable(this.logArtifactLink);
    }
    /**
     * The link to logs for a run on a azure container registry.
     * 
    */
    public Optional<String> logLink() {
        return Optional.ofNullable(this.logLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRunLogSasUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logArtifactLink;
        private @Nullable String logLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRunLogSasUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logArtifactLink = defaults.logArtifactLink;
    	      this.logLink = defaults.logLink;
        }

        public Builder logArtifactLink(@Nullable String logArtifactLink) {
            this.logArtifactLink = logArtifactLink;
            return this;
        }
        public Builder logLink(@Nullable String logLink) {
            this.logLink = logLink;
            return this;
        }        public ListRunLogSasUrlResult build() {
            return new ListRunLogSasUrlResult(logArtifactLink, logLink);
        }
    }
}
