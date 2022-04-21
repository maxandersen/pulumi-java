// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Preferred location. This specifies where a Cloud SQL instance is located. Note that if the preferred location is not available, the instance will be located as close as possible within the region. Only one location may be specified.
 * 
 */
public final class LocationPreferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final LocationPreferenceResponse Empty = new LocationPreferenceResponse();

    /**
     * The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
     */
    @Import(name="followGaeApplication", required=true)
    private String followGaeApplication;

    public String followGaeApplication() {
        return this.followGaeApplication;
    }

    /**
     * This is always `sql#locationPreference`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.). Reserved for future use.
     * 
     */
    @Import(name="secondaryZone", required=true)
    private String secondaryZone;

    public String secondaryZone() {
        return this.secondaryZone;
    }

    /**
     * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private LocationPreferenceResponse() {}

    private LocationPreferenceResponse(LocationPreferenceResponse $) {
        this.followGaeApplication = $.followGaeApplication;
        this.kind = $.kind;
        this.secondaryZone = $.secondaryZone;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationPreferenceResponse $;

        public Builder() {
            $ = new LocationPreferenceResponse();
        }

        public Builder(LocationPreferenceResponse defaults) {
            $ = new LocationPreferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder followGaeApplication(String followGaeApplication) {
            $.followGaeApplication = followGaeApplication;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder secondaryZone(String secondaryZone) {
            $.secondaryZone = secondaryZone;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public LocationPreferenceResponse build() {
            $.followGaeApplication = Objects.requireNonNull($.followGaeApplication, "expected parameter 'followGaeApplication' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.secondaryZone = Objects.requireNonNull($.secondaryZone, "expected parameter 'secondaryZone' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
