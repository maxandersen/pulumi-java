// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datamigration_v1.outputs.CloudSqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.MySqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.PostgreSqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConnectionProfileResult {
    /**
     * A CloudSQL database connection profile.
     * 
     */
    private final CloudSqlConnectionProfileResponse cloudsql;
    /**
     * The timestamp when the resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final String createTime;
    /**
     * The connection profile display name.
     * 
     */
    private final String displayName;
    /**
     * The error details in case of state FAILED.
     * 
     */
    private final StatusResponse error;
    /**
     * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    private final Map<String,String> labels;
    /**
     * A MySQL database connection profile.
     * 
     */
    private final MySqlConnectionProfileResponse mysql;
    /**
     * The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
     */
    private final String name;
    /**
     * A PostgreSQL database connection profile.
     * 
     */
    private final PostgreSqlConnectionProfileResponse postgresql;
    /**
     * The database provider.
     * 
     */
    private final String provider;
    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    private final String state;
    /**
     * The timestamp when the resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetConnectionProfileResult(
        @OutputCustomType.Parameter("cloudsql") CloudSqlConnectionProfileResponse cloudsql,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("error") StatusResponse error,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("mysql") MySqlConnectionProfileResponse mysql,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("postgresql") PostgreSqlConnectionProfileResponse postgresql,
        @OutputCustomType.Parameter("provider") String provider,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.cloudsql = cloudsql;
        this.createTime = createTime;
        this.displayName = displayName;
        this.error = error;
        this.labels = labels;
        this.mysql = mysql;
        this.name = name;
        this.postgresql = postgresql;
        this.provider = provider;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * A CloudSQL database connection profile.
     * 
    */
    public CloudSqlConnectionProfileResponse getCloudsql() {
        return this.cloudsql;
    }
    /**
     * The timestamp when the resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The connection profile display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The error details in case of state FAILED.
     * 
    */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * A MySQL database connection profile.
     * 
    */
    public MySqlConnectionProfileResponse getMysql() {
        return this.mysql;
    }
    /**
     * The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A PostgreSQL database connection profile.
     * 
    */
    public PostgreSqlConnectionProfileResponse getPostgresql() {
        return this.postgresql;
    }
    /**
     * The database provider.
     * 
    */
    public String getProvider() {
        return this.provider;
    }
    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The timestamp when the resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlConnectionProfileResponse cloudsql;
        private String createTime;
        private String displayName;
        private StatusResponse error;
        private Map<String,String> labels;
        private MySqlConnectionProfileResponse mysql;
        private String name;
        private PostgreSqlConnectionProfileResponse postgresql;
        private String provider;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudsql = defaults.cloudsql;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.mysql = defaults.mysql;
    	      this.name = defaults.name;
    	      this.postgresql = defaults.postgresql;
    	      this.provider = defaults.provider;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCloudsql(CloudSqlConnectionProfileResponse cloudsql) {
            this.cloudsql = Objects.requireNonNull(cloudsql);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMysql(MySqlConnectionProfileResponse mysql) {
            this.mysql = Objects.requireNonNull(mysql);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPostgresql(PostgreSqlConnectionProfileResponse postgresql) {
            this.postgresql = Objects.requireNonNull(postgresql);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConnectionProfileResult build() {
            return new GetConnectionProfileResult(cloudsql, createTime, displayName, error, labels, mysql, name, postgresql, provider, state, updateTime);
        }
    }
}
