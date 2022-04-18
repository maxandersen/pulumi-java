// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceRecordSet data for one geo location.
 * 
 */
public final class RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs Empty = new RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="rrdatas")
      private final @Nullable Output<List<String>> rrdatas;

    public Output<List<String>> rrdatas() {
        return this.rrdatas == null ? Codegen.empty() : this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @Import(name="signatureRrdatas")
      private final @Nullable Output<List<String>> signatureRrdatas;

    public Output<List<String>> signatureRrdatas() {
        return this.signatureRrdatas == null ? Codegen.empty() : this.signatureRrdatas;
    }

    public RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs(
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<List<String>> rrdatas,
        @Nullable Output<List<String>> signatureRrdatas) {
        this.kind = kind;
        this.location = location;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
    }

    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs() {
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.rrdatas = Codegen.empty();
        this.signatureRrdatas = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<List<String>> rrdatas;
        private @Nullable Output<List<String>> signatureRrdatas;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }
        public Builder rrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Codegen.ofNullable(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        public Builder signatureRrdatas(@Nullable Output<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }
        public Builder signatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Codegen.ofNullable(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }        public RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs build() {
            return new RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs(kind, location, rrdatas, signatureRrdatas);
        }
    }
}
