// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFusionAlertRuleResult {
    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    private final String alertRuleTemplateName;
    /**
     * @return The description of the alert rule.
     * 
     */
    private final String description;
    /**
     * @return The display name for alerts created by this alert rule.
     * 
     */
    private final String displayName;
    /**
     * @return Determines whether this alert rule is enabled or disabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return The kind of the alert rule
     * Expected value is &#39;Fusion&#39;.
     * 
     */
    private final String kind;
    /**
     * @return The last time that this alert has been modified.
     * 
     */
    private final String lastModifiedUtc;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return The severity for alerts created by this alert rule.
     * 
     */
    private final String severity;
    /**
     * @return The tactics of the alert rule
     * 
     */
    private final List<String> tactics;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFusionAlertRuleResult(
        @CustomType.Parameter("alertRuleTemplateName") String alertRuleTemplateName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastModifiedUtc") String lastModifiedUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("tactics") List<String> tactics,
        @CustomType.Parameter("type") String type) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.lastModifiedUtc = lastModifiedUtc;
        this.name = name;
        this.severity = severity;
        this.tactics = tactics;
        this.type = type;
    }

    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    public String alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }
    /**
     * @return The description of the alert rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name for alerts created by this alert rule.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Determines whether this alert rule is enabled or disabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Etag of the azure resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of the alert rule
     * Expected value is &#39;Fusion&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The last time that this alert has been modified.
     * 
     */
    public String lastModifiedUtc() {
        return this.lastModifiedUtc;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The severity for alerts created by this alert rule.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return The tactics of the alert rule
     * 
     */
    public List<String> tactics() {
        return this.tactics;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFusionAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alertRuleTemplateName;
        private String description;
        private String displayName;
        private Boolean enabled;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String lastModifiedUtc;
        private String name;
        private String severity;
        private List<String> tactics;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFusionAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastModifiedUtc = defaults.lastModifiedUtc;
    	      this.name = defaults.name;
    	      this.severity = defaults.severity;
    	      this.tactics = defaults.tactics;
    	      this.type = defaults.type;
        }

        public Builder alertRuleTemplateName(String alertRuleTemplateName) {
            this.alertRuleTemplateName = Objects.requireNonNull(alertRuleTemplateName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastModifiedUtc(String lastModifiedUtc) {
            this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder tactics(List<String> tactics) {
            this.tactics = Objects.requireNonNull(tactics);
            return this;
        }
        public Builder tactics(String... tactics) {
            return tactics(List.of(tactics));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFusionAlertRuleResult build() {
            return new GetFusionAlertRuleResult(alertRuleTemplateName, description, displayName, enabled, etag, id, kind, lastModifiedUtc, name, severity, tactics, type);
        }
    }
}
