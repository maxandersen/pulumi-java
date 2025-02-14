// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.ForwardSshTunnelConnectivityResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.GcsProfileResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlProfileResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.NoConnectivitySettingsResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.OracleProfileResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.PrivateConnectivityResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.StaticServiceIpConnectivityResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConnectionProfileResult {
    /**
     * @return The create time of the resource.
     * 
     */
    private final String createTime;
    /**
     * @return Display name.
     * 
     */
    private final String displayName;
    /**
     * @return Forward SSH tunnel connectivity.
     * 
     */
    private final ForwardSshTunnelConnectivityResponse forwardSshConnectivity;
    /**
     * @return Cloud Storage ConnectionProfile configuration.
     * 
     */
    private final GcsProfileResponse gcsProfile;
    /**
     * @return Labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return MySQL ConnectionProfile configuration.
     * 
     */
    private final MysqlProfileResponse mysqlProfile;
    /**
     * @return The resource&#39;s name.
     * 
     */
    private final String name;
    /**
     * @return No connectivity option chosen.
     * 
     */
    private final NoConnectivitySettingsResponse noConnectivity;
    /**
     * @return Oracle ConnectionProfile configuration.
     * 
     */
    private final OracleProfileResponse oracleProfile;
    /**
     * @return Private connectivity.
     * 
     */
    private final PrivateConnectivityResponse privateConnectivity;
    /**
     * @return Static Service IP connectivity.
     * 
     */
    private final StaticServiceIpConnectivityResponse staticServiceIpConnectivity;
    /**
     * @return The update time of the resource.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetConnectionProfileResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("forwardSshConnectivity") ForwardSshTunnelConnectivityResponse forwardSshConnectivity,
        @CustomType.Parameter("gcsProfile") GcsProfileResponse gcsProfile,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("mysqlProfile") MysqlProfileResponse mysqlProfile,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("noConnectivity") NoConnectivitySettingsResponse noConnectivity,
        @CustomType.Parameter("oracleProfile") OracleProfileResponse oracleProfile,
        @CustomType.Parameter("privateConnectivity") PrivateConnectivityResponse privateConnectivity,
        @CustomType.Parameter("staticServiceIpConnectivity") StaticServiceIpConnectivityResponse staticServiceIpConnectivity,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.forwardSshConnectivity = forwardSshConnectivity;
        this.gcsProfile = gcsProfile;
        this.labels = labels;
        this.mysqlProfile = mysqlProfile;
        this.name = name;
        this.noConnectivity = noConnectivity;
        this.oracleProfile = oracleProfile;
        this.privateConnectivity = privateConnectivity;
        this.staticServiceIpConnectivity = staticServiceIpConnectivity;
        this.updateTime = updateTime;
    }

    /**
     * @return The create time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Forward SSH tunnel connectivity.
     * 
     */
    public ForwardSshTunnelConnectivityResponse forwardSshConnectivity() {
        return this.forwardSshConnectivity;
    }
    /**
     * @return Cloud Storage ConnectionProfile configuration.
     * 
     */
    public GcsProfileResponse gcsProfile() {
        return this.gcsProfile;
    }
    /**
     * @return Labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return MySQL ConnectionProfile configuration.
     * 
     */
    public MysqlProfileResponse mysqlProfile() {
        return this.mysqlProfile;
    }
    /**
     * @return The resource&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return No connectivity option chosen.
     * 
     */
    public NoConnectivitySettingsResponse noConnectivity() {
        return this.noConnectivity;
    }
    /**
     * @return Oracle ConnectionProfile configuration.
     * 
     */
    public OracleProfileResponse oracleProfile() {
        return this.oracleProfile;
    }
    /**
     * @return Private connectivity.
     * 
     */
    public PrivateConnectivityResponse privateConnectivity() {
        return this.privateConnectivity;
    }
    /**
     * @return Static Service IP connectivity.
     * 
     */
    public StaticServiceIpConnectivityResponse staticServiceIpConnectivity() {
        return this.staticServiceIpConnectivity;
    }
    /**
     * @return The update time of the resource.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private ForwardSshTunnelConnectivityResponse forwardSshConnectivity;
        private GcsProfileResponse gcsProfile;
        private Map<String,String> labels;
        private MysqlProfileResponse mysqlProfile;
        private String name;
        private NoConnectivitySettingsResponse noConnectivity;
        private OracleProfileResponse oracleProfile;
        private PrivateConnectivityResponse privateConnectivity;
        private StaticServiceIpConnectivityResponse staticServiceIpConnectivity;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.forwardSshConnectivity = defaults.forwardSshConnectivity;
    	      this.gcsProfile = defaults.gcsProfile;
    	      this.labels = defaults.labels;
    	      this.mysqlProfile = defaults.mysqlProfile;
    	      this.name = defaults.name;
    	      this.noConnectivity = defaults.noConnectivity;
    	      this.oracleProfile = defaults.oracleProfile;
    	      this.privateConnectivity = defaults.privateConnectivity;
    	      this.staticServiceIpConnectivity = defaults.staticServiceIpConnectivity;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder forwardSshConnectivity(ForwardSshTunnelConnectivityResponse forwardSshConnectivity) {
            this.forwardSshConnectivity = Objects.requireNonNull(forwardSshConnectivity);
            return this;
        }
        public Builder gcsProfile(GcsProfileResponse gcsProfile) {
            this.gcsProfile = Objects.requireNonNull(gcsProfile);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder mysqlProfile(MysqlProfileResponse mysqlProfile) {
            this.mysqlProfile = Objects.requireNonNull(mysqlProfile);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder noConnectivity(NoConnectivitySettingsResponse noConnectivity) {
            this.noConnectivity = Objects.requireNonNull(noConnectivity);
            return this;
        }
        public Builder oracleProfile(OracleProfileResponse oracleProfile) {
            this.oracleProfile = Objects.requireNonNull(oracleProfile);
            return this;
        }
        public Builder privateConnectivity(PrivateConnectivityResponse privateConnectivity) {
            this.privateConnectivity = Objects.requireNonNull(privateConnectivity);
            return this;
        }
        public Builder staticServiceIpConnectivity(StaticServiceIpConnectivityResponse staticServiceIpConnectivity) {
            this.staticServiceIpConnectivity = Objects.requireNonNull(staticServiceIpConnectivity);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetConnectionProfileResult build() {
            return new GetConnectionProfileResult(createTime, displayName, forwardSshConnectivity, gcsProfile, labels, mysqlProfile, name, noConnectivity, oracleProfile, privateConnectivity, staticServiceIpConnectivity, updateTime);
        }
    }
}
