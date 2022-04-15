// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse {
    /**
     * Chain name that the snapshot is created in.
     * 
     */
    private final String chainName;
    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
     */
    private final Boolean guestFlush;
    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    private final List<String> storageLocations;

    @CustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(
        @CustomType.Parameter("chainName") String chainName,
        @CustomType.Parameter("guestFlush") Boolean guestFlush,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("storageLocations") List<String> storageLocations) {
        this.chainName = chainName;
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    /**
     * Chain name that the snapshot is created in.
     * 
    */
    public String chainName() {
        return this.chainName;
    }
    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
    */
    public Boolean guestFlush() {
        return this.guestFlush;
    }
    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
    */
    public List<String> storageLocations() {
        return this.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainName;
        private Boolean guestFlush;
        private Map<String,String> labels;
        private List<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder chainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }
        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(chainName, guestFlush, labels, storageLocations);
        }
    }
}
