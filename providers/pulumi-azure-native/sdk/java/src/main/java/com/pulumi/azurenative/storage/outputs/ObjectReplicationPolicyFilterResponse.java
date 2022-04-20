// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectReplicationPolicyFilterResponse {
    /**
     * Blobs created after the time will be replicated to the destination. It must be in datetime format &#39;yyyy-MM-ddTHH:mm:ssZ&#39;. Example: 2020-02-19T16:05:00Z
     * 
     */
    private final @Nullable String minCreationTime;
    /**
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     * 
     */
    private final @Nullable List<String> prefixMatch;

    @CustomType.Constructor
    private ObjectReplicationPolicyFilterResponse(
        @CustomType.Parameter("minCreationTime") @Nullable String minCreationTime,
        @CustomType.Parameter("prefixMatch") @Nullable List<String> prefixMatch) {
        this.minCreationTime = minCreationTime;
        this.prefixMatch = prefixMatch;
    }

    /**
     * Blobs created after the time will be replicated to the destination. It must be in datetime format &#39;yyyy-MM-ddTHH:mm:ssZ&#39;. Example: 2020-02-19T16:05:00Z
     * 
    */
    public Optional<String> minCreationTime() {
        return Optional.ofNullable(this.minCreationTime);
    }
    /**
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     * 
    */
    public List<String> prefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String minCreationTime;
        private @Nullable List<String> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minCreationTime = defaults.minCreationTime;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder minCreationTime(@Nullable String minCreationTime) {
            this.minCreationTime = minCreationTime;
            return this;
        }
        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }        public ObjectReplicationPolicyFilterResponse build() {
            return new ObjectReplicationPolicyFilterResponse(minCreationTime, prefixMatch);
        }
    }
}
