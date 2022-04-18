// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the run playbook automation rule action
 * 
 */
public final class AutomationRuleRunPlaybookActionResponseActionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final AutomationRuleRunPlaybookActionResponseActionConfiguration Empty = new AutomationRuleRunPlaybookActionResponseActionConfiguration();

    /**
     * The resource id of the playbook resource
     * 
     */
    @Import(name="logicAppResourceId")
      private final @Nullable String logicAppResourceId;

    public Optional<String> logicAppResourceId() {
        return this.logicAppResourceId == null ? Optional.empty() : Optional.ofNullable(this.logicAppResourceId);
    }

    /**
     * The tenant id of the playbook resource
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public AutomationRuleRunPlaybookActionResponseActionConfiguration(
        @Nullable String logicAppResourceId,
        @Nullable String tenantId) {
        this.logicAppResourceId = logicAppResourceId;
        this.tenantId = tenantId;
    }

    private AutomationRuleRunPlaybookActionResponseActionConfiguration() {
        this.logicAppResourceId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleRunPlaybookActionResponseActionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logicAppResourceId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleRunPlaybookActionResponseActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logicAppResourceId = defaults.logicAppResourceId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder logicAppResourceId(@Nullable String logicAppResourceId) {
            this.logicAppResourceId = logicAppResourceId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public AutomationRuleRunPlaybookActionResponseActionConfiguration build() {
            return new AutomationRuleRunPlaybookActionResponseActionConfiguration(logicAppResourceId, tenantId);
        }
    }
}
