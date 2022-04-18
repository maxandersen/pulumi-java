// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Filters limit replication to a subset of blobs within the storage account. A logical OR is performed on values in the filter. If multiple filters are defined, a logical AND is performed on all filters.
 * 
 */
public final class ObjectReplicationPolicyFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ObjectReplicationPolicyFilterResponse Empty = new ObjectReplicationPolicyFilterResponse();

    /**
     * Blobs created after the time will be replicated to the destination. It must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z
     * 
     */
    @Import(name="minCreationTime")
      private final @Nullable String minCreationTime;

    public Optional<String> minCreationTime() {
        return this.minCreationTime == null ? Optional.empty() : Optional.ofNullable(this.minCreationTime);
    }

    /**
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable List<String> prefixMatch;

    public List<String> prefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public ObjectReplicationPolicyFilterResponse(
        @Nullable String minCreationTime,
        @Nullable List<String> prefixMatch) {
        this.minCreationTime = minCreationTime;
        this.prefixMatch = prefixMatch;
    }

    private ObjectReplicationPolicyFilterResponse() {
        this.minCreationTime = null;
        this.prefixMatch = List.of();
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
