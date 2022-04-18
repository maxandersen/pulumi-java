// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTableReplica extends com.pulumi.resources.InvokeArgs {

    public static final GetTableReplica Empty = new GetTableReplica();

    @Import(name="kmsKeyArn", required=true)
      private final String kmsKeyArn;

    public String kmsKeyArn() {
        return this.kmsKeyArn;
    }

    @Import(name="regionName", required=true)
      private final String regionName;

    public String regionName() {
        return this.regionName;
    }

    public GetTableReplica(
        String kmsKeyArn,
        String regionName) {
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
        this.regionName = Objects.requireNonNull(regionName, "expected parameter 'regionName' to be non-null");
    }

    private GetTableReplica() {
        this.kmsKeyArn = null;
        this.regionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyArn;
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.regionName = defaults.regionName;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }        public GetTableReplica build() {
            return new GetTableReplica(kmsKeyArn, regionName);
        }
    }
}
