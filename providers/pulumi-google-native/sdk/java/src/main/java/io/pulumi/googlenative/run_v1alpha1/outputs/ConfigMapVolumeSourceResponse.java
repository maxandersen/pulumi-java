// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.KeyToPathResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConfigMapVolumeSourceResponse {
    /**
     * (Optional) Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final Integer defaultMode;
    /**
     * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    private final List<KeyToPathResponse> items;
    /**
     * Name of the config.
     * 
     */
    private final String name;
    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    private final Boolean optional;

    @OutputCustomType.Constructor
    private ConfigMapVolumeSourceResponse(
        @OutputCustomType.Parameter("defaultMode") Integer defaultMode,
        @OutputCustomType.Parameter("items") List<KeyToPathResponse> items,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("optional") Boolean optional) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    /**
     * (Optional) Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
    */
    public Integer getDefaultMode() {
        return this.defaultMode;
    }
    /**
     * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
    */
    public List<KeyToPathResponse> getItems() {
        return this.items;
    }
    /**
     * Name of the config.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
    */
    public Boolean getOptional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapVolumeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultMode;
        private List<KeyToPathResponse> items;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapVolumeSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setDefaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }

        public Builder setItems(List<KeyToPathResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }
        public ConfigMapVolumeSourceResponse build() {
            return new ConfigMapVolumeSourceResponse(defaultMode, items, name, optional);
        }
    }
}
