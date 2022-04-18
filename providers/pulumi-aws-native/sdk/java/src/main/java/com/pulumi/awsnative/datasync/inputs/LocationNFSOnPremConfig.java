// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains a list of Amazon Resource Names (ARNs) of agents that are used to connect an NFS server.
 * 
 */
public final class LocationNFSOnPremConfig extends com.pulumi.resources.InvokeArgs {

    public static final LocationNFSOnPremConfig Empty = new LocationNFSOnPremConfig();

    /**
     * ARN(s) of the agent(s) to use for an NFS location.
     * 
     */
    @Import(name="agentArns", required=true)
      private final List<String> agentArns;

    public List<String> agentArns() {
        return this.agentArns;
    }

    public LocationNFSOnPremConfig(List<String> agentArns) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
    }

    private LocationNFSOnPremConfig() {
        this.agentArns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSOnPremConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> agentArns;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSOnPremConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
        }

        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }        public LocationNFSOnPremConfig build() {
            return new LocationNFSOnPremConfig(agentArns);
        }
    }
}
