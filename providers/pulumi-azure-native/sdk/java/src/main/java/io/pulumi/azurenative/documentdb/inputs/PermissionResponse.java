// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of data plane operations permitted through this Role Definition.
 * 
 */
public final class PermissionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PermissionResponse Empty = new PermissionResponse();

    /**
     * An array of data actions that are allowed.
     * 
     */
    @Import(name="dataActions")
      private final @Nullable List<String> dataActions;

    public List<String> dataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }

    /**
     * An array of data actions that are denied.
     * 
     */
    @Import(name="notDataActions")
      private final @Nullable List<String> notDataActions;

    public List<String> notDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public PermissionResponse(
        @Nullable List<String> dataActions,
        @Nullable List<String> notDataActions) {
        this.dataActions = dataActions;
        this.notDataActions = notDataActions;
    }

    private PermissionResponse() {
        this.dataActions = List.of();
        this.notDataActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dataActions;
        private @Nullable List<String> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataActions = defaults.dataActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder dataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }
        public Builder dataActions(String... dataActions) {
            return dataActions(List.of(dataActions));
        }
        public Builder notDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }
        public Builder notDataActions(String... notDataActions) {
            return notDataActions(List.of(notDataActions));
        }        public PermissionResponse build() {
            return new PermissionResponse(dataActions, notDataActions);
        }
    }
}
