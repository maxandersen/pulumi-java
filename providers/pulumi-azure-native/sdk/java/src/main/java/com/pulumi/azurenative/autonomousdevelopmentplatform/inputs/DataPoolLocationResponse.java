// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import com.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolEncryptionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of a Data Pool
 * 
 */
public final class DataPoolLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataPoolLocationResponse Empty = new DataPoolLocationResponse();

    /**
     * Encryption properties of a Data Pool location
     * 
     */
    @Import(name="encryption")
      private final @Nullable DataPoolEncryptionResponse encryption;

    public Optional<DataPoolEncryptionResponse> encryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * The location name
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public DataPoolLocationResponse(
        @Nullable DataPoolEncryptionResponse encryption,
        String name) {
        this.encryption = encryption;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataPoolLocationResponse() {
        this.encryption = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataPoolEncryptionResponse encryption;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.name = defaults.name;
        }

        public Builder encryption(@Nullable DataPoolEncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DataPoolLocationResponse build() {
            return new DataPoolLocationResponse(encryption, name);
        }
    }
}
