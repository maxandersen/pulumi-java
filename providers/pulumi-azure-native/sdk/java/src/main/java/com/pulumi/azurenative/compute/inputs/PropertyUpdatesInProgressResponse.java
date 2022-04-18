// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the disk for which update is pending.
 * 
 */
public final class PropertyUpdatesInProgressResponse extends com.pulumi.resources.InvokeArgs {

    public static final PropertyUpdatesInProgressResponse Empty = new PropertyUpdatesInProgressResponse();

    /**
     * The target performance tier of the disk if a tier change operation is in progress.
     * 
     */
    @Import(name="targetTier")
      private final @Nullable String targetTier;

    public Optional<String> targetTier() {
        return this.targetTier == null ? Optional.empty() : Optional.ofNullable(this.targetTier);
    }

    public PropertyUpdatesInProgressResponse(@Nullable String targetTier) {
        this.targetTier = targetTier;
    }

    private PropertyUpdatesInProgressResponse() {
        this.targetTier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyUpdatesInProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetTier;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertyUpdatesInProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetTier = defaults.targetTier;
        }

        public Builder targetTier(@Nullable String targetTier) {
            this.targetTier = targetTier;
            return this;
        }        public PropertyUpdatesInProgressResponse build() {
            return new PropertyUpdatesInProgressResponse(targetTier);
        }
    }
}
