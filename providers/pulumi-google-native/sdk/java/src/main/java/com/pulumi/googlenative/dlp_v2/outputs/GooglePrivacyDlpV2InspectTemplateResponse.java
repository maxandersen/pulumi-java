// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InspectTemplateResponse {
    /**
     * The creation timestamp of an inspectTemplate.
     * 
     */
    private final String createTime;
    /**
     * Short description (max 256 chars).
     * 
     */
    private final String description;
    /**
     * Display name (max 256 chars).
     * 
     */
    private final String displayName;
    /**
     * The core content of the template. Configuration of the scanning process.
     * 
     */
    private final GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
     * 
     */
    private final String name;
    /**
     * The last update timestamp of an inspectTemplate.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GooglePrivacyDlpV2InspectTemplateResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("inspectConfig") GooglePrivacyDlpV2InspectConfigResponse inspectConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.inspectConfig = inspectConfig;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * The creation timestamp of an inspectTemplate.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Short description (max 256 chars).
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Display name (max 256 chars).
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The core content of the template. Configuration of the scanning process.
     * 
    */
    public GooglePrivacyDlpV2InspectConfigResponse inspectConfig() {
        return this.inspectConfig;
    }
    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The last update timestamp of an inspectTemplate.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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
        public Builder inspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            this.inspectConfig = Objects.requireNonNull(inspectConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GooglePrivacyDlpV2InspectTemplateResponse build() {
            return new GooglePrivacyDlpV2InspectTemplateResponse(createTime, description, displayName, inspectConfig, name, updateTime);
        }
    }
}
