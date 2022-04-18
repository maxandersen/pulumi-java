// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a pause cluster operation. For example, a scheduled action to run the `PauseCluster` API operation.
 * 
 */
public final class ScheduledActionPauseClusterMessage extends com.pulumi.resources.InvokeArgs {

    public static final ScheduledActionPauseClusterMessage Empty = new ScheduledActionPauseClusterMessage();

    @Import(name="clusterIdentifier", required=true)
      private final String clusterIdentifier;

    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    public ScheduledActionPauseClusterMessage(String clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
    }

    private ScheduledActionPauseClusterMessage() {
        this.clusterIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionPauseClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionPauseClusterMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }        public ScheduledActionPauseClusterMessage build() {
            return new ScheduledActionPauseClusterMessage(clusterIdentifier);
        }
    }
}
