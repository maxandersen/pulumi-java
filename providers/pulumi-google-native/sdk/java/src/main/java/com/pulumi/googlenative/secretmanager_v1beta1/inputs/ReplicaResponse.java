// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Replica for this Secret.
 * 
 */
public final class ReplicaResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReplicaResponse Empty = new ReplicaResponse();

    /**
     * The canonical IDs of the location to replicate data. For example: `&#34;us-east1&#34;`.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    private ReplicaResponse() {}

    private ReplicaResponse(ReplicaResponse $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaResponse $;

        public Builder() {
            $ = new ReplicaResponse();
        }

        public Builder(ReplicaResponse defaults) {
            $ = new ReplicaResponse(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public ReplicaResponse build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
