// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.ConditionsResponse;
import io.pulumi.azurenative.alertsmanagement.inputs.ScopeResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action rule with diagnostics configuration
 * 
 */
public final class DiagnosticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiagnosticsResponse Empty = new DiagnosticsResponse();

    /**
     * conditions on which alerts will be filtered
     * 
     */
    @Import(name="conditions")
      private final @Nullable ConditionsResponse conditions;

    public Optional<ConditionsResponse> conditions() {
        return this.conditions == null ? Optional.empty() : Optional.ofNullable(this.conditions);
    }

    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="createdAt", required=true)
      private final String createdAt;

    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Created by user name.
     * 
     */
    @Import(name="createdBy", required=true)
      private final String createdBy;

    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Description of action rule
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="lastModifiedAt", required=true)
      private final String lastModifiedAt;

    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Last modified by user name.
     * 
     */
    @Import(name="lastModifiedBy", required=true)
      private final String lastModifiedBy;

    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * scope on which action rule will apply
     * 
     */
    @Import(name="scope")
      private final @Nullable ScopeResponse scope;

    public Optional<ScopeResponse> scope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Indicates type of action rule
     * Expected value is 'Diagnostics'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DiagnosticsResponse(
        @Nullable ConditionsResponse conditions,
        String createdAt,
        String createdBy,
        @Nullable String description,
        String lastModifiedAt,
        String lastModifiedBy,
        @Nullable ScopeResponse scope,
        @Nullable String status,
        String type) {
        this.conditions = conditions;
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.createdBy = Objects.requireNonNull(createdBy, "expected parameter 'createdBy' to be non-null");
        this.description = description;
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
        this.scope = scope;
        this.status = status;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DiagnosticsResponse() {
        this.conditions = null;
        this.createdAt = null;
        this.createdBy = null;
        this.description = null;
        this.lastModifiedAt = null;
        this.lastModifiedBy = null;
        this.scope = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConditionsResponse conditions;
        private String createdAt;
        private String createdBy;
        private @Nullable String description;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private @Nullable ScopeResponse scope;
        private @Nullable String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder conditions(@Nullable ConditionsResponse conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder lastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }
        public Builder scope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DiagnosticsResponse build() {
            return new DiagnosticsResponse(conditions, createdAt, createdBy, description, lastModifiedAt, lastModifiedBy, scope, status, type);
        }
    }
}
