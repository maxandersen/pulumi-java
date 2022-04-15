// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The status of the storage insight.
 * 
 */
public final class StorageInsightStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageInsightStatusResponse Empty = new StorageInsightStatusResponse();

    /**
     * Description of the state of the storage insight.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The state of the storage insight connection to the workspace
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public StorageInsightStatusResponse(
        @Nullable String description,
        String state) {
        this.description = description;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private StorageInsightStatusResponse() {
        this.description = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageInsightStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageInsightStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.state = defaults.state;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public StorageInsightStatusResponse build() {
            return new StorageInsightStatusResponse(description, state);
        }
    }
}
