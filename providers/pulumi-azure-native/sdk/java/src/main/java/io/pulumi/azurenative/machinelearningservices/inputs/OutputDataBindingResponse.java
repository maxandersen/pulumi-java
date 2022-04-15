// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputDataBindingResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutputDataBindingResponse Empty = new OutputDataBindingResponse();

    /**
     * ARM resource ID of the datastore where the data output will be stored.
     * 
     */
    @Import(name="datastoreId")
      private final @Nullable String datastoreId;

    public Optional<String> datastoreId() {
        return this.datastoreId == null ? Optional.empty() : Optional.ofNullable(this.datastoreId);
    }

    /**
     * Mechanism for data movement to datastore.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> mode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * Location of data inside the container process.
     * 
     */
    @Import(name="pathOnCompute")
      private final @Nullable String pathOnCompute;

    public Optional<String> pathOnCompute() {
        return this.pathOnCompute == null ? Optional.empty() : Optional.ofNullable(this.pathOnCompute);
    }

    /**
     * Path within the datastore to the data.
     * 
     */
    @Import(name="pathOnDatastore")
      private final @Nullable String pathOnDatastore;

    public Optional<String> pathOnDatastore() {
        return this.pathOnDatastore == null ? Optional.empty() : Optional.ofNullable(this.pathOnDatastore);
    }

    public OutputDataBindingResponse(
        @Nullable String datastoreId,
        @Nullable String mode,
        @Nullable String pathOnCompute,
        @Nullable String pathOnDatastore) {
        this.datastoreId = datastoreId;
        this.mode = mode;
        this.pathOnCompute = pathOnCompute;
        this.pathOnDatastore = pathOnDatastore;
    }

    private OutputDataBindingResponse() {
        this.datastoreId = null;
        this.mode = null;
        this.pathOnCompute = null;
        this.pathOnDatastore = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputDataBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String mode;
        private @Nullable String pathOnCompute;
        private @Nullable String pathOnDatastore;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputDataBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.mode = defaults.mode;
    	      this.pathOnCompute = defaults.pathOnCompute;
    	      this.pathOnDatastore = defaults.pathOnDatastore;
        }

        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder pathOnCompute(@Nullable String pathOnCompute) {
            this.pathOnCompute = pathOnCompute;
            return this;
        }
        public Builder pathOnDatastore(@Nullable String pathOnDatastore) {
            this.pathOnDatastore = pathOnDatastore;
            return this;
        }        public OutputDataBindingResponse build() {
            return new OutputDataBindingResponse(datastoreId, mode, pathOnCompute, pathOnDatastore);
        }
    }
}
