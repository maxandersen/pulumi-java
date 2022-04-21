// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ReplicationSync contain information about the last replica sync to the cloud.
 * 
 */
public final class ReplicationSyncResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReplicationSyncResponse Empty = new ReplicationSyncResponse();

    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
     */
    @Import(name="lastSyncTime", required=true)
    private String lastSyncTime;

    public String lastSyncTime() {
        return this.lastSyncTime;
    }

    private ReplicationSyncResponse() {}

    private ReplicationSyncResponse(ReplicationSyncResponse $) {
        this.lastSyncTime = $.lastSyncTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationSyncResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationSyncResponse $;

        public Builder() {
            $ = new ReplicationSyncResponse();
        }

        public Builder(ReplicationSyncResponse defaults) {
            $ = new ReplicationSyncResponse(Objects.requireNonNull(defaults));
        }

        public Builder lastSyncTime(String lastSyncTime) {
            $.lastSyncTime = lastSyncTime;
            return this;
        }

        public ReplicationSyncResponse build() {
            $.lastSyncTime = Objects.requireNonNull($.lastSyncTime, "expected parameter 'lastSyncTime' to be non-null");
            return $;
        }
    }

}
