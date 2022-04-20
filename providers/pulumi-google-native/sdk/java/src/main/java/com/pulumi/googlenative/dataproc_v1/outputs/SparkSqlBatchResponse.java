// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SparkSqlBatchResponse {
    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
     */
    private final String queryFileUri;
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name=&#34;value&#34;;).
     * 
     */
    private final Map<String,String> queryVariables;

    @CustomType.Constructor
    private SparkSqlBatchResponse(
        @CustomType.Parameter("jarFileUris") List<String> jarFileUris,
        @CustomType.Parameter("queryFileUri") String queryFileUri,
        @CustomType.Parameter("queryVariables") Map<String,String> queryVariables) {
        this.jarFileUris = jarFileUris;
        this.queryFileUri = queryFileUri;
        this.queryVariables = queryVariables;
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
    */
    public List<String> jarFileUris() {
        return this.jarFileUris;
    }
    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
    */
    public String queryFileUri() {
        return this.queryFileUri;
    }
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name=&#34;value&#34;;).
     * 
    */
    public Map<String,String> queryVariables() {
        return this.queryVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jarFileUris;
        private String queryFileUri;
        private Map<String,String> queryVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryVariables = defaults.queryVariables;
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder queryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }
        public Builder queryVariables(Map<String,String> queryVariables) {
            this.queryVariables = Objects.requireNonNull(queryVariables);
            return this;
        }        public SparkSqlBatchResponse build() {
            return new SparkSqlBatchResponse(jarFileUris, queryFileUri, queryVariables);
        }
    }
}
