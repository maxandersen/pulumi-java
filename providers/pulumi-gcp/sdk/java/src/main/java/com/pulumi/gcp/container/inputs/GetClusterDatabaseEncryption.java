// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterDatabaseEncryption extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDatabaseEncryption Empty = new GetClusterDatabaseEncryption();

    @Import(name="keyName", required=true)
      private final String keyName;

    public String keyName() {
        return this.keyName;
    }

    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public GetClusterDatabaseEncryption(
        String keyName,
        String state) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private GetClusterDatabaseEncryption() {
        this.keyName = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetClusterDatabaseEncryption build() {
            return new GetClusterDatabaseEncryption(keyName, state);
        }
    }
}
